package en02;

/**
 * Created by shouta on 2017/04/17.
 */
public class Kadai04 {
    public static void main(String[] args) {
        Cube[] cube = new Cube[6];

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 1) {
                cube[i] = new Cube(i);
            } else {
                cube[i] = new Cube();
            }

            System.out.print("C" + i);
            System.out.println("SIDE: " + cube[i].getSide() + "VOL: " + cube[i].getVolume());


        }

    }
}
