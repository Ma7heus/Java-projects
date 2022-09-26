package execoes;

import JpaUtil.EntityManagerUtil;
import execoesDAO.FilialDao;
import execoesDAO.UsuarioDAO;
import jakarta.persistence.EntityManager;


public class Main {

	public static void main(String[] args) {

	EntityManager entityManager = EntityManagerUtil.getEntityManager();
	UsuarioDAO usuarioDao = new UsuarioDAO(entityManager);
	FilialDao filialDao = new FilialDao(entityManager);
	
	filialDao.cadastrar();
	
	

	
	
		
		
		
		
		
		
		
	}

}
