package sistemasolare2;


import java.util.ArrayList;

public class indiceDomande {

    private final ArrayList<Domanda> Indice;

    public ArrayList<Domanda> getIndice() {
        return Indice;
    }

    public indiceDomande() {
       this.Indice=new ArrayList<>();
    }
    
    public void aggiungiDomanda(Domanda d){
        Indice.add(d);
    }
    
    public Domanda getDomanda(int i){
        return new Domanda(Indice.get(i));
    }

    
    
}
