/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;

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
        
        boolean inserito=false;
        for(int i=0; i<10; i++){
            if(planet[i]==null&&inserito==false){
               planet[i]=new pianeta(this);
               inserito=true;
            }
    
        }
  
    }
     
    public String toString(){
        
        for(int i=0;i<10;i++){
            if(this.planet[i]!=null){
                return (this.planet[i].getNome()+" Dimensione: "+this.planet[i].getDimensione()+", Peso: "+this.planet[i].getMassa()+", Distanza dal sole: "+this.planet[i].getDisanzaDalSole()+", Forza di gravita: "+this.planet[i].getForzaDiGravita()+", Satellite: "+this.planet[i].getSatellite()+", Distanza satellite: "+this.planet[i].getDistSatellite());
            }
        }
        return null;
    }
    
}
