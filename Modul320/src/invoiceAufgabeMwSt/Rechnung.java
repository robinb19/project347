package invoiceAufgabeMwSt;

public class Rechnung {
    private String text;
    private double preis;

    public Rechnung(String text, double preis){
        this.preis = preis;
        this.text = text;
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
}
