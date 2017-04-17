package en06;

/**
 * Created by shouta on 2017/04/10.
 */
public class Kadai05 {
    public static void main(String[] args) {
        int[] count = new int[6];

        for (int i = 0; i < 100; i++) {
            int r = new java.util.Random().nextInt(6);
            switch (r) {
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(i + ": " + count[i] + " times");
        }
    }
}
