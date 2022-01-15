package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Cleo
 */
public class ConnectionFactory {
     private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
     
}
