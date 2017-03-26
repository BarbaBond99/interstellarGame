/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 *
 * @author f.bonetti
 */
public class Impiccato {
    private String segreta;
    private String parola;
    private int errori;
    private final int tentativi=6;
    private int n;
    
    
    public Impiccato(String segreta)
    {
        this.n=segreta.length();
        setSegreta(segreta.toUpperCase());
        this.errori=0;
        this.n=this.segreta.length();
        setParola();
    
        
    }
    private void setSegreta(String segreta)
    {
        boolean b=false;
        for(int i=0;i<n;i++)
            if(segreta.substring(i,i+1).equals("'"))
                b=true;
        if(b)
        {
            String v[]=new String[2];
             v=segreta.split("'");
             this.segreta=v[1];
            
        }else
            this.segreta=segreta;
    }
    private void setParola()
    {
        parola="";
        for (int i=0;i<n;i++)
        {
            if( segreta.charAt(i)=='A' || segreta.charAt(i)=='E' || segreta.charAt(i)=='I' || segreta.charAt(i)=='O' || segreta.charAt(i)=='U')
                  parola+="+";
            else
                  parola+="_";
        }
    }
    public String getParola()
    {
        return parola;
    }
    public String getSegreta()
    {
        return segreta;
    }
    public int getN()
    {
        return n;
    }
     public int getErrori()
    {
        return errori;
    }
    public void cerca(char c)
    {
        int j=0;
        String s="";
        for (int i=0; i<n;i++)
        {
            if(c==segreta.charAt(i))
            {   
                j++;
                s+=c;
            }else
                s+=parola.charAt(i);
        }
        parola=s;
        if (j==0)
            errori++;
    }
    
    public boolean isVincitore()
    {
        boolean vincitore=true;
        int i=0;
            while(vincitore && i<n)
            {
                if (parola.charAt(i)=='_' || parola.charAt(i)== '+')                    
                    vincitore=false;
                else
                    i++;
            }
        return vincitore;
    }
    public String toString(){
        return this.getParola();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    /**
     * @param args the command line arguments
     */
    public void run() throws IOException{
        String inserisci;
        InputStreamReader Input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(Input);
        char lettera;
        while(!this.isVincitore()){
            System.out.println(this.toString());
            inserisci = keyboard.readLine();
            lettera = inserisci.substring(0,1).toUpperCase().charAt(0);
            this.cerca(lettera);
        } 
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inserisci;
        InputStreamReader Input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(Input);
        Impiccato Luna = new Impiccato("Luna");
        char lettera;
        while(true){
            System.out.println(Luna.toString());
            inserisci = keyboard.readLine();
            lettera = inserisci.substring(0,1).toUpperCase().charAt(0);
            Luna.cerca(lettera);
        } 
    }
}