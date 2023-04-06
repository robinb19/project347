package Repetitions.Abstraktion;

public class MusikCD extends Medium {
    private String interpret;
    private int anzahlLieder;
    private double ausleihgebuehr;

    public MusikCD(String name, boolean entleihstatus, String interpret, int anzahlLieder) {
        super(name, entleihstatus);
        this.interpret = interpret;
        this.anzahlLieder = anzahlLieder;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Interpret: " + this.interpret);
        System.out.println("Anzahl Lieder: " + this.anzahlLieder);
        System.out.println("Ausleihgebühr: " + this.ausleihgebuehr);
    }

    @Override
    public double getGebuehr() {
        return this.ausleihgebuehr;
    }
}
