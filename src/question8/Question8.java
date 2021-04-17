/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S542406
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exam-2 Question-8 : Sai Manideep Allu");
        System.out.println("Bike derived reference & Instance");
        BikeDerived bd = new BikeDerived();
        System.out.println(bd.bikeName());
        
        System.out.println("Bike reference & Bike derived Instance");
        Bike b = new BikeDerived();
        System.out.println(b.bikeName());
    }
    
}
