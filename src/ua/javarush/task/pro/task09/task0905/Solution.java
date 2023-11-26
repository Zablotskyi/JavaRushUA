package ua.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код
        int octal = 0;
        if (decimalNumber <= 0) {
            return 0;
        }
        int i = 0;
        while (decimalNumber != 0) {
            octal = (int) (octal + (decimalNumber % 8) * Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
            i++;
        }
//        String strOctal = Integer.toOctalString(decimalNumber);
//        octal = Integer.parseInt(strOctal);
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        //напишіть тут ваш код
        int decimal = 0;
        if (octalNumber <= 0) {
            return 0;
        }
        int i = 0;
        while (octalNumber != 0) {
            decimal = (int) (decimal + (octalNumber % 10) * Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
//        int decimal = 0;
//        decimal = Integer.parseInt(String.valueOf(octalNumber), 8);
        return decimal;
    }
}
