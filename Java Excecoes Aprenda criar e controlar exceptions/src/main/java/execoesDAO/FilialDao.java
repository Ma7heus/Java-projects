package execoesDAO;

import execoes.Filial;
import jakarta.persistence.EntityManager;


public class FilialDao extends GenericDao{

	public FilialDao(EntityManager em) {
		super(em);
	}
	
	public void cadastrar(Filial filial) {
		super.cadastrar(filial);
		
		
	}
	
	public Filial buscar(Filial filial) {
		return super.buscar(filial);
	}
	
		
}
	
	
