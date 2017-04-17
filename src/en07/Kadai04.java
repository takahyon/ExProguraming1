package en07;

/**
 * Created by shouta on 2017/04/10.
 */

public class Kadai04 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int r = new java.util.Random().nextInt(101);
            if(r >= 60) {
                System.out.println(r + ", PASS");
            } else {
                System.out.println(r + ", FALL");
            }

        }
    }
}
