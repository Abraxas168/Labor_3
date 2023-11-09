package Raume;

public class Verwaltung {
    public static void main(String[] args) {

        Raum r1 = new Raum("Q123", 40, "HP", "OK");
        System.out.println(r1.getBeamer());
        Raum r2 = new Raum("S301", 20, "Epson", "Defekt");
        Raum r3 = new Raum("Q019", 30, "HP", "Lampe Tauschen");
        Raum r4 = new Raum("Q127", 18, "Canon", "OK");
        Raum r5 = new Raum("Q127", 18, "Canon", "OK");

        if (r4 == r5) {
            System.out.println("r4 und r5 sind identisch");
        } else {
            System.out.println("r4 und r5 sind nicht identisch");
        }
        if (r4.getBezeichnung() == r5.getBezeichnung()) {
            System.out.println("Es handelt sich bei r4 und r5 um die selben Räume.");
        } else {
            System.out.println("Es handelt sich bei r4 und r5 um verschiedene Räume.");
        }
        Raum r6=r1;

        if(r6==r1){
            System.out.println("r6 und r1 sind identisch");
        } else {
            System.out.println("r6 und r1 sind nicht identisch");
        }
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println(r5.toString());

        Besprechungsraum b1=new Besprechungsraum("Q115", 10, "Canon", "Defekt", false, 15);
        System.out.println(b1.toString());
        System.out.println(b1 instanceof Raum);
        Raum b2=b1;
        System.out.println(b1 instanceof Besprechungsraum);

        try {
            Besprechungsraum a = (Besprechungsraum) r1;
        }catch (ClassCastException e){
            Beamer b3=r1.getBeamer();
            Besprechungsraum a = new Besprechungsraum(r1.getBezeichnung(), (int)r1.getPlaetze(), b3.getHersteller(), b3.getStatus(), true, 5);
            System.out.println(a.toString());
        }
    }

}