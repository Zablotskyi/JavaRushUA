package ua.javarush.task.pro.task16.task1607;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/* 
Опанування нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишіть тут ваш код
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }

    static LocalDate ofExample() {
        //напишіть тут ваш код
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишіть тут ваш код
        LocalDate specifiedDate = LocalDate.of(2020, 9, 12);
        return LocalDate.ofYearDay(2020, specifiedDate.getDayOfYear());
    }

    static LocalDate ofEpochDayExample() {
        //напишіть тут ваш код
        LocalDate spicifiedDate = LocalDate.of(2020, 9, 12);
        LocalDate date = LocalDate.ofEpochDay(spicifiedDate.toEpochDay());
        return date;
    }
}
