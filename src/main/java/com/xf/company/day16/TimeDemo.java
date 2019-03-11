package com.xf.company.day16;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: XU
 * @Date: 2018/11/5 16:18
 * @Description:
 */
public class TimeDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar cal = Calendar.getInstance();
        System.out.println(calendar==cal);
        System.out.println(calendar);
        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(localDateTime.format(dtf));
        System.out.println(localDateTime.getMinute());
        System.out.println("旧版"+calendar.get(Calendar.MINUTE));
/*--------------------------------------------------------------------------------------------------*/



    }


}
