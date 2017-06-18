package en09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shouta on 2017/06/12.
 */
public class Ex02 {
    public static void main(String[] args) {
        List data = new ArrayList();

        data.add("Tokyo");
        data.add("Kanagawa");
        data.add("Saitama");

        System.out.println("=== Items ===");

        for (int i = 0; i < data.size(); i++) {
            String str = (String)data.get(i);
            System.out.println(str);
        }

        System.out.println("=== Cheking Kanagawa ===");

        if (data.indexOf("Kanagawa") == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }

        System.out.println("=== Chiba ===");

        if (data.indexOf("Chiba") == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }

        data.set(1, "Gunma");

        System.out.println("=== Replacing an item ===");

        for (int i = 0; i < data.size(); i++) {
            String str = (String)data.get(i);
            System.out.println(str);
        }


    }
}
