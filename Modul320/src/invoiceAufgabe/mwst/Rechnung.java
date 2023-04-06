package invoiceAufgabe.mwst;

public class Rechnung {
    private String text;
    private double preis;

    private double mwst;

    public Rechnung(String text, double preis, double mwst){
        this.preis = preis;
        this.text = text;
        this.mwst = mwst;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getMwst() {
        return mwst;
    }

    public void setMwst(double mwst) {
        this.mwst = mwst;
    }
}
