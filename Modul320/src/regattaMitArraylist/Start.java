package regattaMitArraylist;

public class Start {
    public static void main(String[] args) {

        Competition c = new Competition("Rotsee Regatta");

        Ship ship1 = new Ship(1, "Alinghi");
        Ship ship2 = new Ship(2, "Red Baron");
        Ship ship3 = new Ship(3, "Blue Lagoon");

        c.addShip(ship1);
        c.addShip(ship2);
        c.addShip(ship3);

        c.start();

        c.printResult();
    }
}
