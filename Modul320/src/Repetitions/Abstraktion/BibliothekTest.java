package Repetitions.Abstraktion;

public class BibliothekTest {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();


        FilmDVD f1 = new FilmDVD("Michael", true, "jordan", 2);
        FilmDVD f2 = new FilmDVD("Bill", false, "Russ", 3);

        Buch b1 = new Buch("Billie", false, "jean", "habibi", 123, "521d21");
        Buch b2 = new Buch("Russ", true, "westbrook", "187", 5451, "jhfja");

        MusikCD m1 = new MusikCD("Jim", true, "Knopf", 41);
        MusikCD m2 = new MusikCD("anthony", false, "davis", 12);

        bibliothek.addMedium(f1);
        bibliothek.addMedium(f2);

        bibliothek.addMedium(b1);
        bibliothek.addMedium(b2);

        bibliothek.addMedium(m1);
        bibliothek.addMedium(m2);

        System.out.println("Alle Medien in der Bibliothek ");
        bibliothek.showAllMedia();
        System.out.println();
        System.out.println("Alle ausgelihenen ");
        bibliothek.showBorrowedMedia();
        System.out.println();
        System.out.println("Aktuelle Gebühren der ausgeliehenen ");
        bibliothek.calcAusleihgebuehr();
    }
}
