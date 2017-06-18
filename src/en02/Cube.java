package en02;

/**
 * Created by shouta on 2017/04/17.
 */
public class Cube {
    private int side;

    public Cube(int s) {
        side = s;
    }

    public Cube() {
        side = new java.util.Random().nextInt(8)+3;
    }

    public int getSide() {
        return side;
    }

    public int getVolume() {
        return side * side * side;
    }


}
