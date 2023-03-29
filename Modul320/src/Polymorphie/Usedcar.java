package Polymorphie;

public class Usedcar extends Car {
    private int mileage;

    public Usedcar(String model, double price, int mileage) {
        super(model, price);
        this.mileage = mileage;
    }

    public double getPrice(){
       double pr =  super.getPrice();
       double onekilometer = pr/100 * 0.0005;
       pr = pr - (mileage * onekilometer);
       return pr;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
