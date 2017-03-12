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
    
    public void assegnaPianeta(pianeta planeta){
        
        boolean inserito=false;
        for(int i=0; i<10; i++){
            if(this.planet[i]==null&&inserito==false){
              this.planet[i]=new pianeta(planeta);
               inserito=true;
            }
    
        }
  
    }
     
    public String toString(){
        
        String s="";
        
        for(int i=0;i<10;i++){
            if(this.planet[i]!=null){
                if(this.planet[i].getNome()!=null)
                    s+=this.planet[i].getNome();
                if(this.planet[i].getDimensione()!=0)
                    s+="\n, Dimensione: "+this.planet[i].getDimensione();
                if(this.planet[i].getMassa()!=0)
                    s+="\n, Peso: "+this.planet[i].getMassa();
                if(this.planet[i].getDisanzaDalSole()!=0)
                    s+="\n, Distanza dal sole: "+this.planet[i].getDisanzaDalSole();
                if(this.planet[i].getForzaDiGravita()!=0)
                    s+="\nForza di gravita: "+this.planet[i].getForzaDiGravita();
                if(this.planet[i].getSatellite()!=null)
                    s+="\n, Satellite: "+this.planet[i].getSatellite();
                if(this.planet[i].getDistSatellite()!=0)
                    s+="\n, Distanza satellite: "+this.planet[i].getDistSatellite();
                
                return s;
            }
        }
        return null;
    }
    
}
