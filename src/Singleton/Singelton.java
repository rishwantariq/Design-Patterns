/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author rishwantariq
 */
public class Singelton {
    
    private static Singelton instance = null; //a single instance of the class that can only be instantiated once 
    
    public String IMIE;  //we can only have one instance of phone IMIE and no copies
    
    private Singelton()
    {
        this.IMIE = "1404-545554-324553-535";
        System.out.println("IMIE Created: " + this.IMIE);
    }
    
    public static Singelton getIMIE()
    {
        if(instance != null){
            System.out.println("instance exists, refer to that");
            return instance;
        }
        
        else{
            instance = new Singelton();
            System.out.println("instance made"); //this will create a single instance of an object so any further attempts will only refer back to the already existing instance
        }
        return instance;
    }
    
    
}
