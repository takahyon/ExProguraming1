package en07;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shouta on 2017/06/05.
 */
public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dft;
        String output;

        dft = DateFormat.getDateInstance();

        System.out.println(date.toString());
        System.out.println(dft.format(date));
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date));
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));

    }
}
