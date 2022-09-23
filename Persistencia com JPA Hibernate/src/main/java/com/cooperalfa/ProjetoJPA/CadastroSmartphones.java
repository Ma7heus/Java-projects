package com.cooperalfa.ProjetoJPA;

import com.cooperalfa.ProjetoJPA.DAO.SmartphoneDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CadastroSmartphones {
	public static void main(String[] args) {		
		
		//private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PostgrePU");
		//EntityManager em = EntityManagerBuild.getEntityManager();
		
//		Filial filial =  new Filial("Sao Paulo","002","SAO PAULO");
//		Usuario usuario = new Usuario("Matheus","17183",)
		
	    EntityManagerFactory factory = Persistence.
	            createEntityManagerFactory("PostgrePU");

	        EntityManager em = factory.createEntityManager();
	        em.getTransaction().begin();
			Filial filial = em.find(Filial.class, 3);
	        
			Usuario usuario = new Usuario("Matheus","17183",filial);
			em.persist(usuario);
			
	        em.getTransaction().commit();
			em.close();

		
		
		
//	
//		em.getTransaction().begin();
//		
//		Filial filial =  new Filial("Sao Paulo","002","SAO PAULO");
//		filial.setCidade("Sao Paulo");
//		filial.setDescricao("Sao Paulo");
//		filial.setNumeroFilial("002");
//		
//		SmartphoneDAO dao = new SmartphoneDAO(em);
//		
//		dao.cadastrar(filial);
//		em.getTransaction().commit();
//		em.close();
		
	



		
		
	}
	

}
