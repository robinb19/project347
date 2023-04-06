public class Primfaktorzehrlegung {
    public static void main(String[] args) {


        int zahl = 11111; // integer bis 2 147 483 647
        int teiler = 2;
        int teilerMax = (int) Math.sqrt(zahl);
        System.out.print(zahl + " = ");

        while (teiler <= teilerMax) {
            if (zahl % teiler == 0) {
                System.out.print(teiler + " \u00b7 ");
                zahl /= teiler;
                teilerMax = (int) Math.sqrt(zahl);
            } else {
                teiler++;
            }
        }
        System.out.print(zahl);
    }
}
