package ua.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простий шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишіть тут ваш код
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyyр. Hг.mхв");
        String localTime = dateTimeFormatter.format(localDateTime);
        System.out.println(localTime);
    }
}
