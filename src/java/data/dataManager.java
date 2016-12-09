/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author yixxie
 */
public class dataManager {
     EntityManager em;
     public dataManager(){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("WebApplication1PU");
        em = emf.createEntityManager();
     }
     public Test findByName(String name){
        Test retItem;
        try {
            Query query = em.createQuery("SELECT c FROM Test c WHERE c.name = ?1");
            query.setParameter(1,name);
            retItem = (Test) query.getSingleResult();
            
        
        } catch (NoResultException e) {
            System.out.println("Item with name " + name + " not found.\n");
            return null;
        }
        
        return retItem;
    }
}
