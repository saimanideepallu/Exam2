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
public class SuperBike extends Bike {
    
    private String name;

    public SuperBike(String name, int gear, int speed) {
        super(gear, speed);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        System.out.println("This is Super Bike to String");
        return super.toString()+"SuperBike{" + "name=" + name + '}';
    }

    
    
    
}
