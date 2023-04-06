package Abstrakte;

public class CrashedCar extends Car {
    private int damageLevel;

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    public double getPrice(){
        double pr = this.price;
        if (damageLevel == 0){
            pr = pr - pr/100 * 10;
        }

        if(damageLevel == 1){
            pr = pr - pr/100 * 50;
        }

        if (damageLevel == 2){
            pr = 0;
        }
        return pr;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }
}
