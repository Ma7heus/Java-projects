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
	
	Filial filialTeste = new Filial("filial teste", "filial teste", "filial teste");
	
	//filialDao.cadastrar(filialTeste);
	//filialDao.buscar(filialTeste);
	
	//entityManager.getTransaction().begin();
	//entityManager.persist(filialTeste);
	//entityManager.getTransaction().commit();
	//entityManager.close();
	
	filialDao.cadastrar(filialTeste);
	filialDao.buscar(filialTeste);
	
	
	
	

	
	
		
		
		
		
		
		
		
	}

}
