package ua.javarush.task.pro.task08.task0814;

/* 
Прапори
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        //напишіть тут ваш код
        number = number | (1 << flagPos);
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        //напишіть тут ваш код
        number = number & ~(1 << flagPos);
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишіть тут ваш код
        boolean flag = (number & (1 << flagPos)) == (1 << flagPos);
        return flag;
    }
}
