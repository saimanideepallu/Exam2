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
public class Bike {
    private int gear;
    private int speed;

    public Bike() {
    }

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        System.out.println("This is Bike to String");
        return "Bike{" + "gear=" + gear + ", speed=" + speed + '}';
    }
    
    
    
}
 
