package Repetitions.Abstraktion;

public class FilmDVD extends Medium {
    private String regisseur;
    private int laufzeit;
    private double ausleihgebuehr;

    public FilmDVD(String name, boolean entleihstatus, String regisseur, int laufzeit) {
        super(name, entleihstatus);
        this.regisseur = regisseur;
        this.laufzeit = laufzeit;
    }
    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Regisseur: " + this.regisseur);
        System.out.println("Zeit des Filmes: " + this.laufzeit);
        System.out.println("Ausleihgebühr: " + this.ausleihgebuehr);
    }

    @Override
    public double getGebuehr() {
        return this.ausleihgebuehr;
    }

}
