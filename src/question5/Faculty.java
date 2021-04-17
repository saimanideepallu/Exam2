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
public class Faculty extends Employee {
    private int hours;
    private int noOfSubjects;

    public Faculty(int hours, int noOfSubjects, String office, int salary, int date, String name, String address, int phone, String email) {
        super(office, salary, date, name, address, phone, email);
        this.hours = hours;
        this.noOfSubjects = noOfSubjects;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getNoOfSubjects() {
        return noOfSubjects;
    }

    public void setNoOfSubjects(int noOfSubjects) {
        this.noOfSubjects = noOfSubjects;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"This is Faculty toString method"+"\n"+"hours=" + hours + ", noOfSubjects=" + noOfSubjects;
    }
    
    
}
