package en03;

/**
 * Created by shouta on 2017/04/24.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String[] strs = new String[4];
        strs[0] = "computer science";
        strs[1] = "Katakuramachi, Hachioji, Tokyo";
        strs[2] = "Before-tax price is 500 yen";
        strs[3] = "Computer Science";

        System.out.println(strs[2].indexOf("c"));
        System.out.println(strs[1].substring(7,12));
        System.out.println(Double.parseDouble(strs[2].substring(20,24))*1.08);

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equalsIgnoreCase("computer science")) {
                System.out.println("csのindexは" + i);
            }
        }

    }
}