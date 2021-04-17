/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542406
 */
public class MyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Exam-2 Question-5 : Sai Manideep Allu");
        Person p = new Person("Manideep","Maryville",999999,"s542406@nwmissouri");
        Student s = new Student("A","Manideep","Maryville",999999,"s542406@nwmissouri");
        Employee e = new Employee("Austin",100000,10,"Manideep","Maryville",999999,"s542406@nwmissouri");
        Faculty f = new Faculty(40,3,"Austin",100000,10,"Manideep","Maryville",999999,"s542406@nwmissouri");
        Staff st = new Staff("Assistant Professor","Austin",100000,10,"Manideep","Maryville",999999,"s542406@nwmissouri");
        
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
    
}
