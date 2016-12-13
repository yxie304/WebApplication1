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
        /**
        locationManager pm=new locationManager();
        try {
            List<Place> item=pm.findByType("Sports","open");
            for (int i=0;i<item.size();i++){
                System.out.println(item.get(i).getName());
            }
          
        } catch(NullPointerException e) {
          System.out.println(e);
}
*/
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
Date dateobj = new Date();
String a=df.format(dateobj);
System.out.println(a);
    }
}
