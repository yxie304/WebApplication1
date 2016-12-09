package location;


import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import location.Place;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class locationManager {
    EntityManager em;
    
    
    public locationManager() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("WebApplication1PU");
        em = emf.createEntityManager();
        //em = EMF.createEntityManager();
       
    }
    
    public List<Place> findByType(String type){
        List<Place> retItem;
        try {
            Query query = em.createQuery("SELECT c from Place c \n" +
"      inner join " + type + " d on c.osmId = d.osmId");
            retItem = query.getResultList();
        } catch (NoResultException e) {
            System.out.println("Item with name " + type + " not found.\n");
            return null;
        }
        return retItem;
    }
   
    public List<String> getTypes(){
        List<String> retItem=Arrays.asList("Club", "Education", "Food","Health","Living","Parking","Shop","SocialCenter","Sports","Travel","Transport","Utility");
        return retItem;
    }
    
}
