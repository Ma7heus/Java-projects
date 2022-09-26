package execoesDAO;

import execoes.Filial;
import jakarta.persistence.EntityManager;

public abstract class GenericDao {
	private EntityManager em;
	
	public GenericDao(EntityManager em) {
		this.setEm(em);
	}
	
	public void cadastrar() {
		em.getTransaction().begin();
		Filial filial = new Filial("001", "Chapeco", "Matriz");
		this.em.getTransaction().begin();
		this.em.persist(filial);
		this.em.getTransaction().commit();
		this.em.close();				
	}
	
	
	
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	

}
