package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixxie
 */
public class testData {
    public static void main(String[] args){
        dataManager d=new dataManager();
        Test t=d.findByName("coke");
        System.out.println(t.getId());
    }
}
