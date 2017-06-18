package en05;

/**
 * Created by shouta on 2017/05/15.
 */
public class Kadai04 {
    public static void main(String[] args) {
        String istr1 = "192-0982";
        String istr2 = "<100%>Let's Java!</100%> <small>It's fun!</small>";
        //String ostr;

        System.out.println(istr1);
        System.out.println(istr1.replaceAll("(^\\d{3})(-)(\\d{4}$)", "$3$2$1"));
        System.out.println(istr2);
        System.out.println(istr2.replaceAll("<.+?>", ""));
        System.out.println(istr2.replaceAll("(<.+?>)(</.+?>)", ""));


    }
}
