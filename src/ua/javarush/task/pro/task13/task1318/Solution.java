package ua.javarush.task.pro.task13.task1318;

/* 
Наступний місяць, будь ласка
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишіть тут ваш код
        Month resultMonth;
        int index = month.ordinal();
        if (index < 11) {
            resultMonth = Month.values()[index + 1];
            return resultMonth;
        } else {
            resultMonth = Month.values()[0];
            return resultMonth;
        }
    }
}
