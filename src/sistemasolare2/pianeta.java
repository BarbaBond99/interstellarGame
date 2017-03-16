/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a.cacciapuoti
 */
public class pianeta extends CorpoAstronomico{
  
     private indiceDomande lista;

    public indiceDomande getLista() {
        return lista;
    }

    
    
    public void setLista(indiceDomande lista) {
        this.lista = lista;
    }

    public pianeta() throws FileNotFoundException {
        super();
        this.lista=new indiceDomande();
        this.caricaDomande();
    }
     
   public pianeta(pianeta p) throws FileNotFoundException{
       this.setLista(p.getLista());
       this.setDimensione(p.getDimensione());
       this.setDisanzaDalSole(p.getDisanzaDalSole());
       this.setDistSatellite(p.getDistSatellite());
       this.setForzaDiGravita(p.getForzaDiGravita());
       this.setMassa(p.getMassa());
       this.setNome(p.getNome());
       this.setSatellite(p.getSatellite());
       this.setTipo(p.getTipo());
       this.setSelfRotazione(p.getSelfRotazione());
       this.setSoleRotazione(p.getSoleRotazione());
        this.caricaDomande();
   }
  
   
   public void caricaDomande() throws FileNotFoundException
   {    
            Domanda domTemp;
            Scanner stream = new Scanner(new File("domande.csv"));
        // stream.useDelimiter(";");
            ArrayList<String> diz = new ArrayList<String>();

         while (stream.hasNext())
         {

             diz.add(stream.nextLine());
         }
           stream.close();
      
           for(int i=0;i<diz.size();i++)
            {
                domTemp=new Domanda();
                String arr1[];
                arr1= new String[diz.get(i).split(";").length];
                arr1= diz.get(i).split(";");
                domTemp=new Domanda(arr1[0],arr1[1],arr1[2],arr1[3],arr1[4]);
//              System.out.println(domTemp.toString());    
//              if(arr1[5].toLowerCase().equals(this.getNome()))
//              {
                   lista.aggiungiDomanda(domTemp);
//              }
                 

            }
      
    }
   
   
    public static void main(String[] args){
        
    }
   
}
