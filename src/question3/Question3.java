/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542406
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exam-2 Question-3 : Sai Manideep Allu");
        ArrayList<Object> arr = new ArrayList<>();
        
        Loan l = new Loan(100,"education");
        Circle c = new Circle(200);
        String s ="This is string";
        Date d = new Date();
        arr.add(l);
        arr.add(c);
        arr.add(s);
        arr.add(d);
        
        for(Object o : arr)
        {
            System.out.println(o);
        }
    }
    
}
