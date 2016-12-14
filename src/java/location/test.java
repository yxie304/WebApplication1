/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yixxie
 */
public class test {
    public static void main(String args[]){
        
        locationManager pm=new locationManager();
        try {
            Event event=pm.findEvent();
            
            System.out.println(event.getDescription());
           
            
          
        } catch(NullPointerException e) {
          System.out.println(e);
}

     
    }
}
