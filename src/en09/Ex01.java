package en09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shouta on 2017/06/12.
 */
public class Ex01 {
    public static void main(String[] args) {
        List data = new ArrayList();

        data.add("School");
        data.add("Computer");

        System.out.println("=== BEFORE ===");

        for (int i = 0; i < data.size(); i++) {
            String str = (String)data.get(i);
            System.out.println(str);
        }

        data.add(1, "of");

        System.out.println("=== AFTER ===");

        for (int i = 0; i < data.size(); i++) {
            String str = (String)data.get(i);
            System.out.println(str);
        }


    }
}
