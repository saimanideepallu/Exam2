/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author S542406
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exam-2 Question-6 : Sai Manideep Allu");
        Triangle t = new Triangle(20,30,40,"blue",true);
        
        System.out.println("Perimeter of the triangle : "+t.perimeter());
        System.out.println("Area of the triangle : "+t.Area());
        System.out.println("Color of the triangle : "+t.getColor());
        System.out.println("Triangle is filled : "+t.isFilled());
    }
    
}
