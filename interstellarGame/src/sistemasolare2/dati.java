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
public class dati {
    private String nome;
    private String dimensione;
    private String disanzaDalSole;
    private String tipo;
    private String massa;
    private String forzaDiGravita;
    private String satellite;
    private String distSatellite;
    private String forma;
    private int selfRotazione;
    private int soleRotazione;

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }

    public String getDisanzaDalSole() {
        return disanzaDalSole;
    }

    public void setDisanzaDalSole(String disanzaDalSole) {
        this.disanzaDalSole = disanzaDalSole;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getForzaDiGravita() {
        return forzaDiGravita;
    }

    public void setForzaDiGravita(String forzaDiGravita) {
        this.forzaDiGravita = forzaDiGravita;
    }

    public String getSatellite() {
        return satellite;
    }

    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }

    public String getDistSatellite() {
        return distSatellite;
    }

    public void setDistSatellite(String distSatellite) {
        this.distSatellite = distSatellite;
    }

   
    

    public int getSelfRotazione() {
        return selfRotazione;
    }

    public void setSelfRotazione(int selfRotazione) {
        this.selfRotazione = selfRotazione;
    }

    public int getSoleRotazione() {
        return soleRotazione;
    }

    public void setSoleRotazione(int soleRotazione) {
        this.soleRotazione = soleRotazione;
    }

    
    
    public dati() {
        this.nome = null;
        this.dimensione = null;
        this.disanzaDalSole = null;
        this.tipo = null;
        this.massa = null;
        this.forzaDiGravita = null;
        this.satellite = null;
        this.forma= null;
        this.selfRotazione=0;
        this.soleRotazione=0;
        this.distSatellite=null;
        
    }
}
