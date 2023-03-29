package Repetitions.Fachklassen;

public class Tester {
    public static void main(String[] args) {
        Recyhof recyhof = new Recyhof();
        Abfall m1 = new Abfall(true, 2);
        m1.setKg(75);

        Abfall m2 = new Abfall(true, 0);
        m2.setKg(0);

        Abfall e1 = new Abfall(false, 20);
        e1.setKg(2);

        recyhof.addAbfall(m1);
        recyhof.addAbfall(m2);
        recyhof.addAbfall(e1);

        System.out.println("Metallwert: " + recyhof.getMetallwert());
        System.out.println("Gesamtwert: " + recyhof.getGesamtwert());
    }
}
