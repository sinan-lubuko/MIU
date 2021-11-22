package com.derartu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePractice {
    public static void main(String[] args){
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d1.getYear());
        System.out.println(d1.getMonthValue());
        System.out.println(d1.getDayOfMonth());

        LocalDate d2= LocalDate.of(2020,2, 28);
        System.out.println(d2);
        System.out.println(d2.getYear());
        System.out.println(d2.getMonthValue());
        System.out.println(d2.getDayOfMonth());
        System.out.println(d2.getDayOfWeek());

        GregorianCalendar d3 = new GregorianCalendar();
        System.out.println(d3);
        System.out.println(d3.get(Calendar.YEAR));
        System.out.println(d3.get(Calendar.MONTH)+1);
        System.out.println(d3.get(Calendar.DATE));

        GregorianCalendar d4 = new GregorianCalendar(2020, 2, 28);
        System.out.println(d4);
        System.out.println(d4.get(Calendar.YEAR));
        System.out.println(d4.get(Calendar.MONTH)+1);
        System.out.println(d4.get(Calendar.DATE));

        Date d5 = new Date();
        System.out.println(d5);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
        System.out.println(sdf.format(d5));
    }
}
