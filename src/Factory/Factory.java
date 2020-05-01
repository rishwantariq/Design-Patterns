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
public class Factory {
    
       public static void main(String[] args)  
    {
        CreateFactory c = new CreateFactory();
        
        VehicleFactory v1 = c.getVehicle("car");
        VehicleFactory v2 = c.getVehicle("truck");
                
        
        
    }
}
