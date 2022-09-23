package com.cooperalfa.model;

import java.math.BigDecimal;
import java.util.List;
import org.hibernate.type.AnyType;

import com.cooperalfa.ProjetoJPA.DAO.CategoriaDAO;
import com.cooperalfa.ProjetoJPA.DAO.ProdutoDAO;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class CadastroProduto {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = JpaUtil.getEntityManager();		
		ProdutoDAO produtoDAO = new ProdutoDAO(entityManager); 
		CategoriaDAO categoriaDAO = new CategoriaDAO(entityManager);

		
		
		
		
		
		
		
		
	}

}
