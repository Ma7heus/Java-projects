package com.cooperalfa.ProjetoJPA;

import java.math.BigDecimal;
import com.cooperalfa.model.EntityManagerUtil;
import com.cooperalfa.model.Produto;
import jakarta.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {

		
		Filial filial =  new Filial("Matriz","001","Chapeco");
		Usuario usuario = new Usuario("Matheus", "17183",filial);
		Smartphone smartphone = new Smartphone("IPHONE 12",1122344, new BigDecimal(154.54), 1, usuario);
		
		System.out.println(smartphone.getUsuario().getNome());
		
		cadastraSmartphone(smartphone);
	}

		public static void updateSmartphone() {
			
			EntityManager entityManager = EntityManagerUtil.getEntityManager();
			entityManager.getTransaction().begin();		
			Produto produto = entityManager.find(Produto.class, 3);
			produto.setDescricao("Teclado");		
			entityManager.getTransaction().commit();
			entityManager.close();
			
		}

		
		public static void cadastraSmartphone(Smartphone smartphone) {			
						
				smartphone.setStatus(2);
				
				
				EntityManager entityManager = EntityManagerUtil.getEntityManager();
				entityManager.getTransaction().begin();
				entityManager.persist(smartphone);
				entityManager.getTransaction().commit();
				entityManager.close();
			
		}
	
}
