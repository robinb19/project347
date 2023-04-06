package Game;

public class Dagger implements IWeapon{
    public int use(int ap){
        int firsthit = (int) (Math.random() * (ap / 2));
        int secondhit = (int) (Math.random() * (ap / 2));
        secondhit += firsthit;
        return secondhit;
    }
}
