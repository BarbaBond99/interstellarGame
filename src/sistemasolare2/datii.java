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
public class datii {
    private String nome;
    private double dimensione;
    private double disanzaDalSole;
    private String tipo;
    private double volume;
    private double massa;
    private double forzaDiGravita;
    private String satellite;
    private String distSatellite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensione() {
        return dimensione;
    }

    public void setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }

    public double getDisanzaDalSole() {
        return disanzaDalSole;
    }

    public void setDisanzaDalSole(double disanzaDalSole) {
        this.disanzaDalSole = disanzaDalSole;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getForzaDiGravita() {
        return forzaDiGravita;
    }

    public void setForzaDiGravita(double forzaDiGravita) {
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

    public datii() {
        this.nome = "NULL";
        this.dimensione = 0;
        this.disanzaDalSole = 0;
        this.tipo = "NULL";
        this.volume = 0;
        this.massa = 0;
        this.forzaDiGravita = 0;
        this.satellite = "NULL";
    }
    
    
}
