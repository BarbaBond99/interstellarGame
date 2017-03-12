/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Enrico Falco
 */
public class Domanda {
    private String testo;
    private String rispostaVera;
    private String risposta1;
    private String risposta2;
    private String risposta3;
    private int ordine = 0;
    

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getRispostaVera() {
        return rispostaVera;
    }

    public void setRispostaVera(String rispostaVera) {
        this.rispostaVera = rispostaVera;
    }

    public String getRisposta1() {
        return risposta1;
    }

    public void setRisposta1(String risposta1) {
        this.risposta1 = risposta1;
    }

    public String getRisposta2() {
        return risposta2;
    }

    public void setRisposta2(String risposta2) {
        this.risposta2 = risposta2;
    }

    public String getRisposta3() {
        return risposta3;
    }

    public void setRisposta3(String risposta3) {
        this.risposta3 = risposta3;
    }
    

    public Domanda() {
        this.testo = " ";
        this.rispostaVera = " ";
        this.risposta1 = " ";
        this.risposta2 = " ";
        this.risposta3 = " ";
        Random random = new Random();
        ordine = random.nextInt(4);
    }

    public Domanda(String testo, String rispostaVera, String risposta1, String risposta2, String risposta3) {
        this.testo = testo;
        this.rispostaVera = rispostaVera;
        this.risposta1 = risposta1;
        this.risposta2 = risposta2;
        this.risposta3 = risposta3;
        Random random = new Random();
        ordine = random.nextInt(4);
    }
    public Domanda(Domanda d) {
        this.testo = d.getTesto();
        this.rispostaVera = d.getRispostaVera();
        this.risposta1 = d.getRisposta1();
        this.risposta2 = d.getRisposta2();
        this.risposta3 = d.getRisposta3();
        ordine = d.ordine;
    }
    
    public void caricaDomanda() throws FileNotFoundException{
       
        
    }
         
    public boolean controllaSeVero(int k){
        if(k==(ordine+1))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        String tmp="";
        switch(ordine){
            case 0:
                tmp+="1. "+ rispostaVera + "\n";
                tmp+="2. "+ risposta1 + "\n";
                tmp+="3. "+ risposta2 + "\n";
                tmp+="4. "+ risposta3 + "\n";
                break;
            case 1:
                
                tmp+="1. "+ risposta3 + "\n";
                tmp+="2. "+ rispostaVera + "\n";
                tmp+="3. "+ risposta1 + "\n";
                tmp+="4. "+ risposta2 + "\n";
                break;
            case 2:                
                tmp+="1. "+ risposta2 + "\n";
                tmp+="2. "+ risposta3 + "\n";
                tmp+="3. "+ rispostaVera + "\n";
                tmp+="4. "+ risposta1 + "\n";
                break;
            case 3:                
                tmp+="1. "+ risposta1 + "\n";
                tmp+="2. "+ risposta2 + "\n";
                tmp+="3. "+ risposta3 + "\n";
                tmp+="4. "+ rispostaVera + "\n";
                break;
        }
        
        return "Domanda: " + testo + "\n" + tmp;
    }
    
    public void runDomanda(){
        System.out.println(this.toString());
        int k;
        boolean y=false;
        Scanner keyboard = new Scanner(System.in);
        do{
            k=keyboard.nextInt();
            if(this.controllaSeVero(k)){
                System.out.println("Corretto!!");
                y=true;
            }
            else{
                System.out.println("Riprova :(");
            }
        }while(!y);
    }
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException {
     
        Domanda d = new Domanda("domamanda 1?", "v", "f1", "f2", "f3");
        System.out.println(d.toString());
        int k;
        boolean y=false;
        Scanner keyboard = new Scanner(System.in);
        do{
            k=keyboard.nextInt();
            if(d.controllaSeVero(k)){
                System.out.println("Corretto!!");
                y=true;
            }
            else{
                System.out.println("Riprova :(");
            }
        }while(!y);
    }
    
    
}
