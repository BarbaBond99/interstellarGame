package sistemasolare2;


import java.util.ArrayList;

public class indiceDomande {

    private final ArrayList<Domanda> Indice;
    private int dim;

    public ArrayList<Domanda> getIndice() {
        return Indice;
    }

    public indiceDomande() {
       this.Indice=new ArrayList<>();
       dim = 0;
    }
    
    public void aggiungiDomanda(Domanda d){
        Indice.add(d);
        dim++;
    }
    
    public Domanda getDomanda(int i){
        return new Domanda(Indice.get(i));
    }

    
    
}
