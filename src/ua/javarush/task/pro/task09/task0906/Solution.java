package ua.javarush.task.pro.task09.task0906;

/*
Двійковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишіть тут ваш код
        String binary = new String();
        if (decimalNumber < 1) {
            return "";
        } else {
            while (decimalNumber != 0) {
                binary = decimalNumber % 2 + binary;
                decimalNumber = decimalNumber / 2;
            }
            return String.valueOf(binary);
        }
    }
    public static int toDecimal(String binaryNumber) {
        //напишіть тут ваш код
        int decimal = 0;
        if ((binaryNumber == null) || (binaryNumber.equals(""))) {
            return 0;
        } else {
            int countDown = binaryNumber.length() - 1;
            for (int i = 0; i < binaryNumber.length(); i++) {
                decimal = (int) (decimal + Character.digit(binaryNumber.charAt(countDown), 10) * Math.pow(2, i));
                countDown--;
            }
            return decimal;
        }
    }
}
