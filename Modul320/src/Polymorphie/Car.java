package Polymorphie;

public class Car {
    private String model;
    private double price;


    public Car(String model, double price){
        this.model = model;
        this.price = price;
    }

    public Car(String model){
        this.model = model;
    }

    protected double getPrice(){
        return price;
    }

    protected String getModel(){
        return model;
    }

}
