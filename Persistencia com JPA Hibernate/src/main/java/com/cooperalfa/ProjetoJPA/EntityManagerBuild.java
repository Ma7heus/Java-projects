package com.cooperalfa.ProjetoJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerBuild {

	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PostgrePU");
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	
	
}






    

