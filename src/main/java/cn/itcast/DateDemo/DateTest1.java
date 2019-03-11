package cn.itcast.DateDemo;

import java.util.Date;

/**
 * @author : XU
 * @date : 2019/2/18 14:21
 */
public class DateTest1 {
    public static void main(String[] args) {
      /*  Date today = DateUtils.truncate(new Date(), Calendar.DATE);
        Calendar cal = DateUtils.toCalendar(today);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        //cal.add(Calendar.DATE, 7);
      //  Date a = cal.getTime();
       // System.out.println(a);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        Date weekStart = cal.getTime();
        System.out.println(weekStart);*/
        // Positive example:
        long a = System.currentTimeMillis();
        // Negative example:
        long b = new Date().getTime();

        System.out.println(a);
        System.out.println(b);
    }
}
