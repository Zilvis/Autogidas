package Bazinis;

import java.util.Comparator;

public class AutomobilisIml implements Comparable <AutomobilisIml> {
    private String marke;
    private String modelis;
    private double kaina;
    private int metai;
    private String kebuloTipas;
    private String kuroTipas;
    private int rida;
    private int duruSkaicius;

    public AutomobilisIml (){}

    public AutomobilisIml (String marke,String modelis,double kaina,int metai,String kebuloTipas,String kuroTipas,int rida,int duruSkaicius){
        this.marke = marke;
        this.modelis = modelis;
        this.kaina = kaina;
        this.metai = metai;
        this.kebuloTipas = kebuloTipas;
        this.kuroTipas = kuroTipas;
        this.rida = rida;
        this.duruSkaicius = duruSkaicius;
    }

    public void setMarke (String marke){
        this.marke = marke;
    }

    public String getMarke (){
        return marke;
    }

    public void setModelis (String modelis){
        this.modelis = modelis;
    }

    public String getModelis (){
        return modelis;
    }

    public void setKaina (double kaina){
        this.kaina = kaina;
    }

    public double getKaina(){
        return kaina;
    }

    public void setMetai (int metai){
        this.metai = metai;
    }

    public int getMetai(){
        return metai;
    }

    public void setKebuloTipas (String kebuloTipas){
        this.kebuloTipas = kebuloTipas;
    }

    public String getKebuloTipas(){
        return kebuloTipas;
    }

    public void setKuroTipas (String kuroTipas){
        this.kuroTipas = kuroTipas;
    }

    public String getKuroTipas (){
        return kuroTipas;
    }

    public void setRida (int rida){
        this.rida = rida;
    }

    public int getRida(){
        return rida;
    }

    public void setDuruSkaicius(int duruSkaicius){
        this.duruSkaicius = duruSkaicius;
    }

    @Override
    public String toString() {
        return String.format("Marke: %s | Modelis: %s | Duru Skaicius: %d | Kaina: %.0f | Metai: %d | Kebulas: %s | Kuras: %s | Rida: %d",marke,modelis,duruSkaicius,kaina,metai,kebuloTipas,kuroTipas,rida);

    }

    @Override
    public int compareTo(AutomobilisIml automobilis) {
        return Comparator
                .comparing(AutomobilisIml::getMarke)
                .thenComparing(AutomobilisIml::getMetai)
                .compare(this,automobilis);//.
    }
}
