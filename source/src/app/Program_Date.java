package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_Date {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        int year = 1 + cal.get(Calendar.YEAR);

        cal.add(Calendar.DAY_OF_MONTH,4);
        date = cal.getTime();
        System.out.println(sdf.format(date));
        System.out.println("Minutes :" + minutes);
        System.out.println("Month :" + month);
        System.out.println("Year :" + year);



    }
}
