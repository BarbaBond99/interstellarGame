/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;

import java.util.Scanner;

/**
 *
 * @author Enrico Falco
 */

public class Main{
    
    public static void main(String[] args){
        System.out.println("Benvenuto in questo viaggio interstellare\n" +
                            "Sei pronto a viaggiare per il sistema solare\n" +
                            "Ed ad ampliare le tue conoscenze su ciò che ci circonda?\n" +
                            "Bene! Iniziamo, Ora ti trovi ancora sul tuo pianeta, la Terra\n" +
                            "Per cominciare una nuova avventura rispondi ad alcune semplici domande sulla Terra \n");
        indiceDomande arr=new indiceDomande();
        Domanda d = new Domanda("C'è vita sulla Terra?", "Si", "No", "Gli scienziati non ne sono sicuri", "Solo in alcuni periodi dell'anno");
        arr.aggiungiDomanda(d);
        d = new Domanda("Qual'è la VERA forma della Terra?", "Geoide", "Sfera", "Palla", "Cubo");
        arr.aggiungiDomanda(d);
        d = new Domanda("Quanto tempo impiega la Terra per compiere un giro attorno a se stessa?", "24 Ore", "365 Giorni", "24 Mesi", "12 Ore");
        arr.aggiungiDomanda(d);
        d = new Domanda("Quanto tempo impiega la Terra per compiere un giro attorno al Sole?", "365 Giorni", "24 Ore", "24 Mesi", "12 Ore");
        arr.aggiungiDomanda(d);
        d = new Domanda("Quanti satelliti naturali ha la Terra", "1", "0", "2", "7");
        arr.aggiungiDomanda(d);
        d = new Domanda("Come si chiama?", "Luna", "Sole", "Mercurio", "Terra2");
        arr.aggiungiDomanda(d);
        for(int i = 0; i < arr.length(); i++){
            arr.getDomanda(i).runDomanda();
        }
        System.out.println("Eccellente, ricordati che tutto ciò che impari ti servirà in futuro,\n"
                + "Ecco a te un diario di viaggio in cui annotarti quel che sai e che scoprirai di ogni pianeta\n"
                + "Ora ti faccio vedere cosa hai trovato fino ad ora:\n"
                + "TERRA:\n"
                + "1. C'è la vita\n"
                + "2.Geoide\n"
                + "3. Giorno 24 ore\n"
                + "4. Anno 365 giorni\n"
                + "5. Ha un solo satellite di nome LUNA\n");
        System.out.println("Sbloccati nuovi dati nel formulario\nMassa Terra = 5,9726 × 1024 kg,\nVolume Terra = 1,08321 × 1021 m³,\nAccelerazione di gravità terrestre = 9,8 m/s \n \nSbloccata Luna");
        System.out.println("Vuoi andare sulla luna?\n1.Si\n2.No");
        int k;
        Scanner keyboard = new Scanner(System.in);
        do{
            k=keyboard.nextInt();
            if(k!=1 && k!=2)
                System.out.println("Scelta non valida");
            else if(k==1)
                System.out.println("Perfetto!\nArriverai tra qualche istante,\nanzi guarda sei gia' arrivato!!! \nBENVENUTO SULLA LUNA");
            else 
                System.err.println("Mi disapice sei gia' in viaggio\nArriverai tra qualche istante,\nanzi guarda sei gia' arrivato (MUHAHAHAH)!!! \nBENVENUTO SULLA LUNA");
        }while(k!=1 && k!=2);
        
        
        
    }
}
