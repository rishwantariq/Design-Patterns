/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceprogramming4;

/**
 *
 * @author rishwantariq
 */
public class cloneFactory {
    
    public Smartphone getClone(Smartphone smartphone)
    {
        System.out.print("Smartphone copy made: " + smartphone.getModel());
        return smartphone.makeModel(); //this class will return the smartphone model prototype to the client 
    }
}

