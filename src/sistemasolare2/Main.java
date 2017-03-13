/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Enrico Falco
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        pianeta Terra = new pianeta();
        enciclopedia treccani = new enciclopedia();

        System.out.println("PROGETTO SISTEMA SOLARE\nBenvenuto in questo viaggio interstellare\n"
                + "Sei pronto a viaggiare per il sistema solare\n"
                + "Ed ad ampliare le tue conoscenze su ciò che ci circonda?\n"
                + "Bene! Iniziamo, Ora ti trovi ancora sul tuo pianeta, la Terra\n"
                + "Per cominciare una nuova avventura rispondi ad alcune semplici domande sulla Terra \n");
        
        Thread.sleep(4000);
        Terra.setNome("Terra");
        Domanda d;
        
        /*indiceDomande arr = new indiceDomande();
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
        arr.aggiungiDomanda(d);*/
        for (int i = 0; i < Terra.getLista().length(); i++) {
            Terra.getLista().getDomanda(i).runDomanda();                
        }
       
        Terra.setSatellite(Terra.getLista().getDomanda(Terra.getLista().length()-1).getRispostaVera());
        treccani.assegnaPianeta(Terra);
        System.out.println(treccani.toString());
        Thread.sleep(1000);
//        System.out.println("Eccellente, ricordati che tutto ciò che impari ti servirà in futuro,\n"
//                + "Ecco a te un diario di viaggio in cui annotarti quel che sai e che scoprirai di ogni pianeta\n"
//                + "Ora ti faccio vedere cosa hai trovato fino ad ora:\n"
//                + "TERRA:\n"
//                + "1. C'è la vita\n"
//                + "2.Geoide\n"
//                + "3. Giorno 24 ore\n"
//                + "4. Anno 365 giorni\n"
//                + "5. Ha un solo satellite di nome LUNA\n");

        System.out.println("[Sbloccati nuovi dati nel formulario\nMassa Terra = 5,9726 × 10^24 kg,\nVolume Terra = 1,08321 × 10^21 m³,\nAccelerazione di gravità terrestre = 9,8 m/s]\n");
        Terra.setForzaDiGravita("9.8");
        Terra.setMassa("5,9726 * 10^24");
        Terra.setDimensione("1,08321 * 10^21");
        Thread.sleep(2000);
        System.out.println("[Sbloccata Luna]");
        System.out.println("Vuoi andare sulla luna?\n1.Si\n2.No");
        String k;
        Scanner keyboard = new Scanner(System.in);
        do {
            k = keyboard.nextLine();
            if (!k.equals("1") && !k.equals("2")) {
                System.out.println("Scelta non valida");
            } else if (k.equals("1")) {
                System.out.println("Stai viaggiando verso la luna...\nè un viaggio lungo, ci vorrà un po di tempo... \n");                
                Thread.sleep(5000);
                System.out.println("Ecco, stai approcciando la luna\n");
                Thread.sleep(2000);
            } 
            else {
                System.out.println("Mi disapice sei gia' in viaggio\nArriverai tra qualche istante,\nanzi guarda sei gia' arrivato (MUHAHAHAH)!!! \nBENVENUTO SULLA LUNA");
                Thread.sleep(4000);
            }
        } while (!k.equals("1") && !k.equals("2"));
        indiceDomande arrLuna = new indiceDomande();
        d = new Domanda("Sapendo che la massa della Luna è 1/80 della massa della Terra, che formula devo applicare per calcolare la massa della Luna", "1/80*MassaTerra", "80*MassaTerra", "MassaTerra+80Kg*2", "MassaTerra-80kg^2");
        arrLuna.aggiungiDomanda(d);
        d = new Domanda("Sapendo che il Volume della Luna è il 2%, qual'è la formula da applicare per calcolare il volume della Luna", "VolumeTerra*2/100", "VolumeTerra*100", "VolumeTerra*200", "VolumeTerra+2/100");
        arrLuna.aggiungiDomanda(d);
        d = new Domanda("Sapendo che la Forza di gravità della Luna è 1/6, qual'è la formula da usare per sapere quanto vale l'accelerazione di gravità della Luna?", "AccelerazionegravitàTerra/6", "AccelerazionegravitàTerra*6", "AccelerazionegravitàTerra+6", "AccelerazionegravitàTerra-6");
        arrLuna.aggiungiDomanda(d);
        for(int i = 0; i < arrLuna.length(); i++){
            arrLuna.getDomanda(i).runDomanda();
            k="";
            switch(i){
            case 0:
                do{
                    if(k.equals("help"))
                        System.out.println(treccani.toString());
                    else if(k.equals("risp"))
                        System.out.println("746575");
                    else if(!k.equals(""))
                        System.out.println("Sagliato");
                    else
                        System.out.println("Quanto vale? (sapendo che il numero sarà moltiplicato per 10^18)\nPer guardare l'enciclopedia digita help");
                    k = keyboard.nextLine();
                }while(!k.equals("746575"));
                System.out.println("corretto");
                break;
            case 1:
                do{
                    if(k.equals("help"))
                        System.out.println(treccani.toString());
                    else if(k.equals("risp"))
                        System.out.println("2708025");
                    else if(!k.equals(""))
                        System.out.println("Sbagliato");
                    else
                        System.out.println("Quanto vale? (sapendo che il numero sarà moltiplicato per 10^11)\nPer guardare l'enciclopedia digita help");
                    k = keyboard.nextLine();
                }while(!k.equals("2708025"));
                System.out.println("Corretto");
                break;
            case 2:
                do{
                    if(k.equals("help"))
                        System.out.println(treccani.toString());
                    else if(k.equals("risp"))
                        System.out.println("16");
                    else if(!k.equals(""))
                        System.out.println("Sbaglaito");
                    else
                        System.out.println("Quanto vale? (sapendo che il numero sarà diviso per 10)\nPer guardare l'enciclopedia digita help");
                    k = keyboard.nextLine();
                }while(!k.equals("16"));
                System.out.println("Corretto");
                break;
            }
        }
        System.out.println("Molto bene, ma siamo solo all'inizio,\n"
                + "Adesso puoi proseguire la tua esplorazione per altri pianeti...");
        int c=0;
        while(c!=1){
        System.out.println("press 1 to exit");
        c = keyboard.nextInt();
        }
        Runtime.getRuntime().exit(0);
    }
}