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
public class CreateFactory {
    public VehicleFactory getVehicle(String vehicle)
    {
        if(vehicle.equalsIgnoreCase("car"))
        {
            return new Car();
        }
        
        else if (vehicle.equalsIgnoreCase("bike"))
        {
            return new Bike();
        }
        
        else if (vehicle.equalsIgnoreCase("truck"))
        {
            return new Truck();
        }
        return null;
    }
}
