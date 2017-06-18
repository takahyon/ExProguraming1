package en09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by shouta on 2017/06/12.
 */
public class Ex04 {
    public static void main(String[] args) {
        List data = new ArrayList();
        Random rnd = new Random();
        int count = 0;

        for (int i = 0; i < 10; i++) {
            data.add(rnd.nextInt(10));
        }

        for(Iterator it = data.iterator(); it.hasNext(); ) {
            int num = (int)it.next();
            System.out.print(num);
            System.out.print(", ");
            if (num == 7) {
                count += 1;
            }
        }

        System.out.println("\n7は" + count + "回");

        for(Iterator it = data.iterator(); it.hasNext(); ) {
            int num = (int)it.next();
            if (num == 7) {
                it.remove();
            }
        }

        for(Iterator it = data.iterator(); it.hasNext(); ) {
            int num = (int)it.next();
            System.out.print(num);
            System.out.print(", ");
        }

    }
}
