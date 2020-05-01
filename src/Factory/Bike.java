/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author rishwantariq
 */
public class Bike extends VehicleFactory {
    
    Bike()
    {
        super("bike",10);
        System.out.println("bike has been created");
    }
            
}
