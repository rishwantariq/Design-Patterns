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
public class driver {
    
       public static void main(String[] args)  {
           Singelton S1 = Singelton.getIMIE();
           Singelton s2 = Singelton.getIMIE();
       }
    
}
