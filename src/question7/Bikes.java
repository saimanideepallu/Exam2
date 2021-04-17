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
public enum Bikes {
    
    ROYAL_ENFIELD(100000),JAWA(200000),YAMAHA(300000),VESPA(400000);
    
    private final int bikePrice;

    private Bikes(int bikePrice) {
        this.bikePrice = bikePrice;
    }

    public static Bikes getROYAL_ENFIELD() {
        return ROYAL_ENFIELD;
    }

    public static Bikes getJAWA() {
        return JAWA;
    }

    public static Bikes getYAMAHA() {
        return YAMAHA;
    }

    public static Bikes getVESPA() {
        return VESPA;
    }

    public int getBikePrice() {
        return bikePrice;
    }
    
    
}
