package invoiceAufgabe.mwst;

public class ausfuehren {
    public static void main(String[] args) {
        Firma rg = new Firma();
        Rechnung r = new Rechnung("icetea", 1.50, 7.7);



        Rechnung r1 = new Rechnung("Kaffe", 2.50, 0);
        Rechnung r2 = new Rechnung("Shamppooo", 7, 3.6);
        Rechnung r3 = new Rechnung("Hoodie", 54, 7.7);

        rg.addRechnung(r1);
        rg.addRechnung(r2);
        rg.addRechnung(r3);

        rg.printFirma();
    }
}
