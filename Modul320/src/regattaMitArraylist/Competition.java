package regattaMitArraylist;

import java.util.ArrayList;

public class Competition {
    private String name;
    ArrayList<Ship> schiffe = new ArrayList<Ship>();



    /**
     * Erstellt ein neues Wettkampf Objekt
     *
     * @param name Name des Wettkampfs
     */
    public Competition(String name) {
        this.name = name;
    }

    /**
     * Startet den Wettkampf.
     *
     * @see Ship#race()
     */
    public void start() {

        for (Ship s : schiffe) {
            if (s != null) {
                s.race();
            }
        }

        // Alternative:
        /*
         * for (int i = 0; i < ships.length; i++) {
         * 	if (ships[i] != null) {
         * 		Ship s = ships[i];
         * 		s.race();
         *  }
         * }
         */
    }

    /**
     * Fügt ein Schiff zum Wettkampf hinzu, sofern noch nicht alle Plätze belegt
     * sind.
     *
     * @param s Ship

    public void addShip(String schiffe) {
        for (int i = 0; i < ; i++) {
            if (schiffe[i] == null) {
                schiffe[i] = schiffe;
                break;
            }
        }
    }*/

    public void addShip(Ship schiff){
        schiffe.add(schiff);
    }

    /**
     * Gibt alle Schiffe des Wettkampfs auf die Konsole aus
     */
    public void printResult() {
        System.out.println("Wettkampf: " + this.name);

        for (Ship s : this.schiffe) {
            if (s != null) {
                System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
            }
        }
    }
}
