package com.cooperalfa.ProjetoJPA.DAO;

import com.cooperalfa.ProjetoJPA.Filial;
import jakarta.persistence.EntityManager;

public class SmartphoneDAO {

	    private EntityManager em;
	    
	    public SmartphoneDAO(EntityManager em) {
	        this.em = em;
	    }

	    public void cadastrar(Filial filial) {
	    	this.em.persist(filial);
	    }
	    
		public EntityManager getEm() {
			return em;
		}
		
		
	

	

}
