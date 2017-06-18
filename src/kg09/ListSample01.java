package kg09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shouta on 2017/06/12.
 */
public class ListSample01 {
    public static void main(String[] args) {
        List data = new ArrayList();

        String s1 = "Katakuramachi";
        String s2 = "Hachiouji";
        String s3 = "Tokyo";

        data.add(s1);
        data.add(s2);
        data.add(s3);

        for (int i = 0; i < data.size(); i++) {
            String str = (String)data.get(i);
            System.out.println(str);
        }
    }
}
