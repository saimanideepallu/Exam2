/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author S542406
 */
public class InheritanceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exam-2 Question-4 : Sai Manideep Allu");
        System.out.println("This is by Inheritance");
        SuperBike sb1 = new SuperBike("RoyalEnfields",6,100);
        System.out.println(sb1);
        
        System.out.println("This is by Polymorphism");
        Bike b1;
        SuperBike sb2 = new SuperBike("Jawa",5,80);
        b1=sb2;
        System.out.println(b1);
        
        System.out.println("This is by Late Binding Polymorphism");
        Bike b2 = new SuperBike("Vespa",5,90);
        System.out.println(b2);
    }
    
}
