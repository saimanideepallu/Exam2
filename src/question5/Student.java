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
public class Student extends Person{
    private String grade;
    final String status = "Graduate";

    public Student(String grade, String name, String address, int phone, String email) {
        super(name, address, phone, email);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"This is Student toString method"+"\n"+"grade=" + grade + ", status=" + status;
    }
    
    
}
