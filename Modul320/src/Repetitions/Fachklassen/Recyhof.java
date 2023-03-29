package Repetitions.Fachklassen;

import java.util.ArrayList;

public class Recyhof {
    private ArrayList<Abfall> abfaelle = new ArrayList<Abfall>();

    public void addAbfall(Abfall a){
        this.abfaelle.add(a);
    }

    public double getMetallwert() {
        double metallwert = 0;
        for (Abfall a : this.abfaelle){
            if(a.isMetall()){
                metallwert = metallwert + a.getWert();
            }

        }
        return metallwert;
    }
    public double getGesamtwert(){
        double gesamtwert = 0;
        for(Abfall a : this.abfaelle){
            gesamtwert = gesamtwert + a.getWert();
        }
        return gesamtwert;
    }
}

