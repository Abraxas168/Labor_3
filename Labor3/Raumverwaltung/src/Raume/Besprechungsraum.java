package Raume;

public class Besprechungsraum extends Raum {
    private Boolean kaffeemaschine;
    private int kekssorten;

    public Besprechungsraum (String bezeichnung, int plaetze, String hersteller, String status, Boolean kaffeemaschine, int kekssorten){
        super(bezeichnung, plaetze, hersteller, status);
        this.kaffeemaschine=kaffeemaschine;
        this.kekssorten=kekssorten;
    }

    public Boolean getKaffeemaschine() {
        return kaffeemaschine;
    }

    public int getKekssorten() {
        return kekssorten;
    }

    public void setKaffeemaschine(Boolean kaffeemaschine) {
        this.kaffeemaschine = kaffeemaschine;
    }

    public void setKekssorten(int kekssorten) {
        this.kekssorten = kekssorten;
    }
    @Override
    public String toString(){
        String kafein="";
        if (this.kaffeemaschine==true){
           kafein+= "Kaffeemaschine vorhanden";
        }
        else{
            kafein+="Keine Kaffeemaschine vorhanden";
        }
        return super.toString() + ", " + this.kekssorten +" Kekssorten vorhanden, " + kafein;
    }
}
