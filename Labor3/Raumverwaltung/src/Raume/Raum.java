package Raume;

public class Raum {
    private String bezeichnung;
    private int plaetze;
    private Beamer beamer;

    public Raum(String bezeichnung, int plaetze, Beamer beamer) {
        this.bezeichnung = bezeichnung;
        this.plaetze = plaetze;
        this.beamer = beamer;
    }
    public Raum(String bezeichnung, int plaetze, String hersteller, String status){
        this.bezeichnung=bezeichnung;
        this.plaetze=plaetze;
        this.beamer=new Beamer(hersteller, status);
    }
    public String getBezeichnung(){
        return bezeichnung;
    }
    public int getPlaetze(){
        return plaetze;
    }
    public Beamer getBeamer(){
        return beamer;
    }
    public void setPlaetze(int plaetze){
        this.plaetze=plaetze;
    }
    public void setBeamer(Beamer beamer) {
        this.beamer = beamer;
    }

    @Override
    public String toString() {
        return "Raum: " + this.bezeichnung + ", freie Plätze: " + this.plaetze + ", Beamer: " + this.beamer.toString();
    }
}
