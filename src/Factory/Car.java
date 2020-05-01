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
public class Car extends VehicleFactory {
    
    Car()
    {
        super("car",30);
        System.out.println("car has been created with speed: " + speed);
    }
    
}
