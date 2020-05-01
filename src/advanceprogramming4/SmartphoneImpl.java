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
public class SmartphoneImpl implements Smartphone {
    
    String modelName; //to set the name of smartphone model 
    
    public void setName(String name) {
        this.modelName = name;
    }
    
    public Smartphone makeModel() {
        try {
            return (SmartphoneImpl) super.clone(); //if a clone of a smartphone model is found (in cache), it will be returned to the client
        } catch(Exception e) {
            
        }
        return null;
    }
    
    public String getModel() // to get the name of smartphone model
    {
        return modelName;
    }
    
}
