package en05;

/**
 * Created by shouta on 2017/05/15.
 */
public class Kadai01 {
    public static void main(String[] args) {
        String istr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String ostr;

        System.out.println(istr);
        System.out.println(istr.replaceAll("[This]", "*"));
        System.out.println(istr.replaceAll("[^This]", "*"));
        System.out.println(istr.replaceAll("K.+Z|k.+z", "*"));
    }
}
