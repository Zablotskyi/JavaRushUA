package ua.javarush.task.pro.task09.task0907;

/*
Шістнадцятковий конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишіть тут ваш код
        String hex = "";
        if (decimalNumber <= 0) {
            return hex;
        } else {
            while (decimalNumber != 0) {
                hex = HEX.charAt(decimalNumber % 16) + hex;
                decimalNumber = decimalNumber / 16;
            }
            return hex;
        }
    }

    public static int toDecimal(String hexNumber) {
        //напишіть тут ваш код
        int decimal = 0;
        if ((hexNumber == null) || (hexNumber.equals(""))) {
            return 0;
        } else {
            for (int i = 0; i < hexNumber.length(); i++) {
                char hexChar = hexNumber.charAt(i);
                int hexIndex = HEX.indexOf(hexChar);
                decimal = 16 * decimal + hexIndex;
            }
            return decimal;
        }
    }
}
