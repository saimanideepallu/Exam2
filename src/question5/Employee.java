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
public class Employee extends Person {
    private String office;
    private int salary;
    private int date;

    public Employee(String office, int salary, int date, String name, String address, int phone, String email) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date = date;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"This is Employee toString method"+"\n"+"office=" + office + ", salary=" + salary + ", date=" + date;
    }
    
    
}
