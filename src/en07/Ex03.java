package en07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by shouta on 2017/06/05.
 */
public class Ex03 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.DATE, 27);

        System.out.println("今日は" + new SimpleDateFormat("yyyy年MM月dd日").format(date) + "です今日から２ヶ月と２７日後は" + calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DATE) + "日です");

    }
}
