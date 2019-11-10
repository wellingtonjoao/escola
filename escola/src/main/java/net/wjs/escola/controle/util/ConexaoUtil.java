package br.com.controle.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author WJS
 */
public class ConexaoUtil {
	private static final String PERSISTENCE_UNIT_NAME = "Controledb";
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public static void main(String[] args) {
		EntityManager em = ConexaoUtil.getEntityManager();

	}
}