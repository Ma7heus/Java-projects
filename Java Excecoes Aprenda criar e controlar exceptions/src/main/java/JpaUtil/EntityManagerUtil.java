package JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
	
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SmartDB");

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
}
