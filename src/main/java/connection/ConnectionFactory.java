/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

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
