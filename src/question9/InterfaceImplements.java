/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author S542406
 */
public class InterfaceImplements implements MyInterface {

    @Override
    public String bikeDetails() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "My bike Name is : "+bikeName+"\n"+"My bike Cost is : "+bikeCost;
    }
    
    
}
