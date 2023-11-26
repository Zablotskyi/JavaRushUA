package ua.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Ще один простий шаблон
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишіть тут ваш код
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String localDateTime = dateTimeFormatter.format(zonedDateTime);
        System.out.println(localDateTime);
    }
}
