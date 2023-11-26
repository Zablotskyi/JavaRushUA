package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2023, GregorianCalendar.OCTOBER, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишіть тут ваш код
        var dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String date = null;
        switch (dayOfWeek) {
            case 1:
                date = "Неділя";
                break;
            case 2:
                date = "Понеділок";
                break;
            case 3:
                date = "Вівторок";
                break;
            case 4:
                date = "Середа";
                break;
            case 5:
                date = "Четвер";
                break;
            case 6:
                date = "П'ятниця";
                break;
            case 7:
                date = "Субота";
                break;
        }
        return date;
    }
}
