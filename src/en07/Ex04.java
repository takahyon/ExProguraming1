package en07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by shouta on 2017/06/05.
 */

public class Ex04 {
    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        Date date = new Date();

        c1.set(1970, 1, 1, 0, 00, 00);
        c3.set(2020, 7, 24, 20, 20 , 00);

        long diff = c3.getTimeInMillis() - c2.getTimeInMillis();
        System.out.println(c2.getTimeInMillis() - c1.getTimeInMillis());
        System.out.println(c3.getTimeInMillis() - c2.getTimeInMillis());

        System.out.println(new SimpleDateFormat("yyyy/MM/dd(E) hh/mm/ss, ").format(date) + c2.getTimeInMillis());
        System.out.println("2020/07/24(金) 20:00:00, " + c3.getTimeInMillis());
        System.out.println("東京オリンピックまであと" + diff / (1000 * 60 * 60 * 365));
    }
}
