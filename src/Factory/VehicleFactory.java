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
public abstract class VehicleFactory {
    String type;
    int speed;
    
    VehicleFactory(String s, int i)
    {
        this.type = s;
        this.speed = i;
    }
    
}
