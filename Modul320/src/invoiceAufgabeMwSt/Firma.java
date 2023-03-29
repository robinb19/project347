package invoiceAufgabeMwSt;

import java.util.ArrayList;

public class Firma {
    private ArrayList<Rechnung> liste;

    private double mwst;
    public Firma(double mwst){
        this.liste = new ArrayList<Rechnung>();
        this.mwst = mwst;
    }

    public double getMwst() {
        return mwst;
    }

    public void setMwst(double mwst) {
        this.mwst = mwst;
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

    public double amountMwst(){
        double amountmwst = (getFirmaAmountExcl() / 100) * mwst;
        return amountmwst;
    }

    public double total(){
        double amountTotal = getFirmaAmountExcl() + amountMwst();
        return amountTotal;
    }
    public void printFirma() {
        System.out.println("**********Rechnung**********");
        for(Rechnung p : this.liste) {
            System.out.println(p.getText() + ": " + p.getPreis());
        }
       // System.out.println("TOTAL exkl. Mwst: " + this.getFirmaAmountExcl());
        System.out.println("MwSt. 7.7%" + amountMwst());
        System.out.println("TOTAL exkl. Mwst: " + total());
    }
}

