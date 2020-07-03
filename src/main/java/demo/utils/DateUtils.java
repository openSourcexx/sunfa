package demo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static void main(String[] args) throws ParseException {

        System.out.println(getMoneyByAddDays(new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-28"), 5));
        System.out.println(getMoneyByAddMouth(new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-14"), 5));
    }

    /**
     * 按天计算收益
     *
     * @param date
     * @param days
     * @return
     */
    public static Date getMoneyByAddDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    /**
     * 按月计算收益
     *
     * @param date
     * @param mouth
     * @return
     */
    public static Date getMoneyByAddMouth(Date date, int mouth) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.MONTH, mouth);
        return calendar.getTime();
    }
}
