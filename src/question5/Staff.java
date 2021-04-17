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
public class Staff extends Employee {
    private String title;

    public Staff(String title, String office, int salary, int date, String name, String address, int phone, String email) {
        super(office, salary, date, name, address, phone, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"This is Staff toString method"+"\n"+"title=" + title;
    }
    
    
}
