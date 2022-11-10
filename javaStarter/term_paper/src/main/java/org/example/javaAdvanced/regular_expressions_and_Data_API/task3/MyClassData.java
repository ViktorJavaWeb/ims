package org.example.javaAdvanced.regular_expressions_and_Data_API.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyClassData {
    public MyClassData(String data) {

        String[] str = data.split("\\.");

        String year = str[2];
        String month = str[1];
        String day = str[0];

        System.out.println("year = " + year);

        try {

            Calendar currentCalendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();

            Calendar calendar = Calendar.getInstance();
            Date date = new Date();
            calendar.setTime(date);


            calendar.set(Calendar.YEAR, Integer.parseInt(year));
            calendar.set(Calendar.MONTH, Integer.parseInt(month));
            calendar.set(Calendar.DATE, Integer.parseInt(day));
            calendar.set(Calendar.HOUR_OF_DAY,0);
            calendar.set(Calendar.MINUTE,0);
            calendar.set(Calendar.SECOND,0);
            calendar.set(Calendar.MILLISECOND,0);

            calendar2.set(Calendar.YEAR,(currentCalendar.get(Calendar.YEAR)-calendar.get(Calendar.YEAR)));
            calendar2.set(Calendar.MONTH,(currentCalendar.get(Calendar.MONTH)-calendar.get(Calendar.MONTH)));
            calendar2.set(Calendar.DATE,(currentCalendar.get(Calendar.DATE)-calendar.get(Calendar.DATE)));
            calendar2.set(Calendar.HOUR_OF_DAY,currentCalendar.get(Calendar.HOUR_OF_DAY)-calendar.get(Calendar.HOUR_OF_DAY));
            calendar2.set(Calendar.MINUTE,currentCalendar.get(Calendar.MINUTE)-calendar.get(Calendar.MINUTE));
            calendar2.set(Calendar.SECOND,currentCalendar.get(Calendar.SECOND)-calendar.get(Calendar.SECOND));


            System.out.println("year - " + calendar2.get(Calendar.YEAR)+ "\nmonth - " + calendar2.get(Calendar.MONTH) + "\nday - "+ calendar2.get(Calendar.DATE)+"\nhours - " + calendar2.get(Calendar.HOUR_OF_DAY)+"\nminets - " +calendar2.get(Calendar.MINUTE)+"\nsecond - "+calendar2.get(Calendar.SECOND));


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
