package Game;

public class Axe implements IWeapon {
    public int use(int ap){
        int hit = (int) (Math.random() * ap);
        return hit;
    }
}
