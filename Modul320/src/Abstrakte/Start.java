package Abstrakte;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

        ArrayList<Car> carArrayList = new ArrayList<Car>();

        //Car car = new Car("BMW",550);
        Usedcar usedcar = new Usedcar("Audi",500,1000);
        CrashedCar crashedCar = new CrashedCar("Mercedes", 500, 0);

        carArrayList.add(usedcar);
        carArrayList.add(crashedCar);

        for( Car c :carArrayList ){
            System.out.println("model: "+ c.getModel() + "  Preis: " + c.getPrice());
        }

        //System.out.println(car.getPrice());
        System.out.println(usedcar.getPrice());
        System.out.println(crashedCar.getPrice());



    }
}
