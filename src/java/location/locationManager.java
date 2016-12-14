package location;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.PreDestroy;
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
    
    @PreDestroy
    public void destruct(){
        em.close();
    }
    public locationManager() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("WebApplication1PU");
        em = emf.createEntityManager();
        //em = EMF.createEntityManager();
       
    }
    
    public List<Place> findByType(String type,String open){
        List<Place> retItem;
        Query query;
        try {
            if(open.equals("yes")){   //find currently open
                DateFormat df = new SimpleDateFormat("HH:mm:ss");
                Date dateobj = new Date();
                String currentTime=df.format(dateobj);
                query = em.createQuery("SELECT c from Place c \n" +
"      inner join " + type + " d on c.osmId = d.osmId WHERE c.openTime < CAST('" + currentTime + "' as time) AND c.closeTime > CAST('" + currentTime+"' AS TIME)");
            }
            else{   //find all
                query = em.createQuery("SELECT c from Place c \n" +
"      inner join " + type + " d on c.osmId = d.osmId");
            }
            retItem =query.getResultList();
            if (retItem.isEmpty()){
                return null;
            }
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
    
    public List<Place> findByName(String name){
        List<Place> retItem;   // '%" + searchParameter
        try {
            Query query = em.createQuery("SELECT c from Place c WHERE LOWER(c.name) LIKE LOWER('%"+name+"%')");
            //query.setParameter(1, name);
            retItem = query.getResultList();
            if (retItem.isEmpty()){
                return null;
            }
        } catch (NoResultException e) {
            System.out.println("Item with name " + name + " not found.\n");
            return null;
        }
        return retItem;
    }
    
    public Lonlat findbyID(long osm_id){
        Lonlat item = em.find(location.Lonlat.class, osm_id);
        return item;
    }
     
    public Event findEvent(){
        int event_id = (int )(Math.random() * 11 + 1);
        Event event = em.find(location.Event.class,event_id);
        
        return event;
    }
}
