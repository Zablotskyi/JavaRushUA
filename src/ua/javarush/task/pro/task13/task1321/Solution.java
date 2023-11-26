package ua.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вівторок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {
        String en;
        if (ua.toLowerCase().equals("понеділок")) {
            en = "Monday";
        } else if (ua.toLowerCase().equals("вівторок")) {
            en = "Tuesday";
        } else if (ua.toLowerCase().equals("середа")) {
            en = "Wednesday";
        } else if (ua.toLowerCase().equals("четвер")) {
            en = "Thursday";
        } else if (ua.toLowerCase().equals("п'ятниця")) {
            en = "Friday";
        } else if (ua.toLowerCase().equals("субота")) {
            en = "Saturday";
        } else if (ua.toLowerCase().equals("неділя")) {
            en = "Sunday";
        } else {
            en = "Неприпустимий день тижня";
        }
        return en;

    }
}
