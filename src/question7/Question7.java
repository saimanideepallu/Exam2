/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author S542406
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exam-2 Question-7 : Sai Manideep Allu");
        Bikes a = Bikes.ROYAL_ENFIELD;
        System.out.println("The price of "+a+" bike is "+a.getBikePrice());
        Bikes b = Bikes.JAWA;
        System.out.println("The price of "+b+" bike is "+b.getBikePrice());
        Bikes c = Bikes.YAMAHA;
        System.out.println("The price of "+c+" bike is "+c.getBikePrice());
        Bikes d = Bikes.VESPA;
        System.out.println("The price of "+d+" bike is "+d.getBikePrice());
    }
    
}
