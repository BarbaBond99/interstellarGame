/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;

import sistemasolare2.pianeta;

/**
 *
 * @author a.cacciapuoti
 */
public class enciclopedia  extends pianeta{
    
    private pianeta []planet;

    public pianeta[] getPlanet() {
        return planet; 
    }

    public void setPlanet(pianeta[] planet) {
        this.planet = planet;
    }


    public enciclopedia() {
        this.planet = new pianeta[10];
    }
    
    
    public static void pulisciSchermo() {  
    for(int i=0; i<24; i++)
        System.out.println("\n"); 
    } 
    
    public void assegnaPianeta(pianeta planet[]){
        
        
        
    }
    
}
