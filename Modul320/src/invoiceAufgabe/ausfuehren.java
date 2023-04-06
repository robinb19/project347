package invoiceAufgabe;

public class ausfuehren {
    public static void main(String[] args) {
        Firma rg = new Firma();

        Rechnung r1 = new Rechnung("Kaffe", 2.50);
        Rechnung r2 = new Rechnung("Shamppooo", 7);
        Rechnung r3 = new Rechnung("Hoodie", 54);

        rg.addRechnung(r1);
        rg.addRechnung(r2);
        rg.addRechnung(r3);

        rg.printFirma();
    }
}
