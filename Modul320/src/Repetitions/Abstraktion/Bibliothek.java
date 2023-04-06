package Repetitions.Abstraktion;

import java.util.ArrayList;

public class Bibliothek {
    private ArrayList<Medium> medien = new ArrayList<Medium>();

    public void addMedium(Medium m){
        this.medien.add(m);
    }

    public void showAllMedia(){
            for (Medium m : this.medien){
                m.printInformation();
        }
    }
    public void showBorrowedMedia(){
        for (Medium m : this.medien){
            if (m != null && m.getEntleihstatus()){
                m.printInformation();
            }
        }
    }

    public double calcAusleihgebuehr(){
        double geld = 0;
        for (Medium m : this.medien){
            if (m != null && m.getEntleihstatus()){
                geld += m.getGebuehr();
            }
        }
        return geld;
    }
}
