package invoiceAufgabe;

import java.util.ArrayList;

public class Firma {
    private ArrayList<Rechnung> liste;
    //private List<Rechnung> = new Arraylist<Rechnung>();
    public Firma(){
        this.liste = new ArrayList<Rechnung>();
    }
    public void addRechnung(Rechnung rechnung){
        liste.add(rechnung);
    }

    public double getFirmaAmountExcl(){
        double amount = 0;
        for (Rechnung p : this.liste) {
            amount += p.getPreis();
        }
        return amount;
    }
    public void printFirma() {
        System.out.println("**********Rechnung**********");
        for(Rechnung p : this.liste) {
            System.out.println(p.getText() + ": " + p.getPreis());
        }
        System.out.println("TOTAL exkl. Mwst: " + this.getFirmaAmountExcl());
    }
}

