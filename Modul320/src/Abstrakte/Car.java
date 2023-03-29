package Abstrakte;

public abstract class Car {
    private String model;
    protected double price;


    public Car(String model, double price){
        this.model = model;
        this.price = price;
    }

    public Car(String model){
        this.model = model;
    }

    protected abstract double getPrice();

    protected String getModel(){
        return model;
    }

}
