package ua.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/*
Аби не в понеділок:)
*/

public class Solution {
    static Date birthDate = new Date(123, Calendar.OCTOBER, 15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишіть тут ваш код
//        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", new Locale("uk", "UA"));
//        String formatterData = sdf.format(date);
        String dayOfWeek = null;
        switch (date.getDay()) {
            case 1:
                dayOfWeek = "понеділок";
                break;
            case 2:
                dayOfWeek = "вівторок";
                break;
            case 3:
                dayOfWeek = "середа";
                break;
            case 4:
                dayOfWeek = "четвер";
                break;
            case 5:
                dayOfWeek = "п'ятниця";
                break;
            case 6:
                dayOfWeek = "субота";
                break;
            case 0:
                dayOfWeek = "неділя";
                break;
        }
        return dayOfWeek;
    }
}