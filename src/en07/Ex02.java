package en07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by shouta on 2017/06/05.
 */
public class Ex02 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println(new SimpleDateFormat("yyyy/MM/dd(E曜日) a hh/mm/ss.SSS z").format(date));
        System.out.println("2017/1/1から数えて" + calendar.get(Calendar.DAY_OF_YEAR) + "日目");
    }
}
