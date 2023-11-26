package ua.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Кінець часів
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишіть тут ваш код
        long maxMilliseconds = Long.MAX_VALUE;
        return Instant.ofEpochMilli(maxMilliseconds);
    }

    static Instant getMaxFromSeconds() {
        //напишіть тут ваш код
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишіть тут ваш код
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
    }
}
