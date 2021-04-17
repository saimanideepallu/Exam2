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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Grades g = Grades.GRADEC;
    System.out.println("Exam-2 Question-7 : Sai Manideep Allu");
    switch(g) {
      case GRADEA:
        System.out.println("The Grade was A");
        break;
      case GRADEB:
         System.out.println("The Grade was B");
        break;
      case GRADEC:
        System.out.println("The Grade was C");
        break;
        
      case GRADED:
        System.out.println("The Grade was D");
        break;

    }
    
}
}
