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
public class Truck extends VehicleFactory {
    Truck()
    {
        super("truck",5);
        System.out.println("truck has been created with speed: " + speed);
    }
}
