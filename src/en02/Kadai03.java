package en02;

/**
 * Created by shouta on 2017/04/17.
 */
public class Kadai03 {
    public static void main(String[] args) {
        Cube c1 = new Cube(4);

        System.out.print("C1, ");
        System.out.println("SIDE: " + c1.getSide() + "VOL: " + c1.getVolume());

        Cube c2 = new Cube();

        System.out.print("C2, ");
        System.out.println("SIDE: " + c2.getSide() + "VOL: " + c2.getVolume());
    }
}
