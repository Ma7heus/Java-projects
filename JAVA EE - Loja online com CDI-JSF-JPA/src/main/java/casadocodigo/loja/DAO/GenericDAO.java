package casadocodigo.loja.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Stateless
public abstract class GenericDAO<T,ID> {
	
	public Class<T> clazz; 

	@PersistenceContext
	private EntityManager em;
	
	public GenericDAO(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	public void cadastrar(T clazz) {
		em.persist(clazz);
	}
	
	public void deleta(ID idEntidade) {
		T entidade = em.find(clazz, idEntidade);
		em.remove(entidade);
	}
	
	public void atualiza(T clazz) {
		em.merge(clazz);
	}
	
	public List<T> buscaTodos() {
		return em.createQuery( " select entidade from " + clazz.getSimpleName() + " entidade ",
				clazz).getResultList();
	}
	
	public T buscarById(ID idEntidade) {
		return em.find(clazz, idEntidade);
	}
	
	
	
	
	
	
	
}
