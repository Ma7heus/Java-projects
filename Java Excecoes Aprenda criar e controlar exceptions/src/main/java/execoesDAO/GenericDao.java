package execoesDAO;

import execoes.Filial;
import jakarta.persistence.EntityManager;

public abstract class GenericDao {
	private EntityManager em;
	
	public GenericDao(EntityManager em) {
		this.setEm(em);
	}
	
	public void cadastrar(Filial classeEntidade) {
		this.em.getTransaction().begin();
		this.em.persist(classeEntidade);
		this.em.getTransaction().commit();
		this.em.close();				
	}
	
	public Filial buscar(Filial classeEntidade){
		this.em.getTransaction().begin();
		Filial entidade = this.em.find(classeEntidade.getClass(), classeEntidade);
		this.em.getTransaction().commit();
		this.em.close();
		return entidade;
	}
	
	
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	

}
