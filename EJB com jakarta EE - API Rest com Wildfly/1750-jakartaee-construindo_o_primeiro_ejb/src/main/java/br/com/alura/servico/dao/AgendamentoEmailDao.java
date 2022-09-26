package br.com.alura.servico.dao;


import javax.persistence.EntityManager;

public class AgendamentoEmailDao {
	
	private EntityManager entityManager;
	
	
	public AgendamentoEmailDao() {
		
	}


	public EntityManager getEntityManager() {
		return entityManager;
	}

}
