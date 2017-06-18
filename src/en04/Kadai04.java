package en04;

/**
 * Created by shouta on 2017/05/08.
 */
public class Kadai04 {
    public static void main(String[] args) {
        String str = "ADDR: 1303-1, Katakuramachi, Hachioji, 192-0982, JAPAN";
        //String result;

        System.out.println(str);
        System.out.println(str.replaceAll("chi", "*"));
        System.out.println(str.replaceAll("[0-9]", "?"));
        System.out.println(str.replaceAll("[a-zA-Z_0-9]", "x"));
        System.out.println(str.replaceAll("[A-Z]", "!"));
        System.out.println(str.replaceAll("[0-9][0-9][0-9][0-9]", "?"));

    }
}
