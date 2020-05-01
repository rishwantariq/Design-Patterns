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
public class AdvanceProgramming4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)  {
        
        cloneFactory c = new cloneFactory();
        
        SmartphoneImpl s1 = new SmartphoneImpl();
        s1.setName("Oneplus 7 pro");
        
        SmartphoneImpl s2 = new SmartphoneImpl();
        s2.setName("Samsung S20");
        
        SmartphoneImpl s1Clone = (SmartphoneImpl) c.getClone(s1);
        System.out.println();
        SmartphoneImpl s2Clone = (SmartphoneImpl) c.getClone(s2);
        System.out.println();


        
        
    }
}
