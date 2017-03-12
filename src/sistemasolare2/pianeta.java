/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;

import java.io.FileNotFoundException;

/**
 *
 * @author a.cacciapuoti
 */
public class pianeta extends dati{
  
     private indiceDomande lista;

    public indiceDomande getLista() {
        return lista;
    }

    public void setLista(indiceDomande lista) {
        this.lista = lista;
    }

    public pianeta() {
        super();
        this.lista = lista;
    }
     
   public pianeta(pianeta p){
       this.setLista(p.getLista());
       this.setDimensione(p.getDimensione());
       this.setDisanzaDalSole(p.getDisanzaDalSole());
       this.setForzaDiGravita(p.getForzaDiGravita());
       this.setMassa(p.getMassa());
       this.setNome(p.getNome());
       this.setSatellite(p.getSatellite());
       this.setTipo(p.getTipo());
       this.setSelfRotazione(p.getSelfRotazione());
       this.setSoleRotazione(p.getSoleRotazione());
       this.setDistSatellite(p.getDistSatellite());
   }
  
    public static void main(String[] args) throws FileNotFoundException {
    
       
        
    }
   
}
