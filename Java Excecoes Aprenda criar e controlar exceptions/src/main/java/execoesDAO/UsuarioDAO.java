package execoesDAO;

import jakarta.persistence.EntityManager;

public class UsuarioDAO {
	private EntityManager em;

	
	public UsuarioDAO(EntityManager entityManager) {
		this.em = entityManager;
	}
	
	
	
	
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	

}
