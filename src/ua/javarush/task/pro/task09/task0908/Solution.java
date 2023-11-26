package ua.javarush.task.pro.task09.task0908;

/*
Двійково-шістнадцятковий конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишіть тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        } else {
            while (binaryNumber.length() % 4 != 0) {
                binaryNumber = "0" + binaryNumber;
            }
            int decimal = 0;
            int countDown = binaryNumber.length() - 1;
            for (int i = 0; i < binaryNumber.length(); i++) {
                decimal = (int) (decimal + Character.digit(binaryNumber.charAt(countDown), 10) * Math.pow(2, i));
                countDown--;
            }
            String hex = new String();
            int decimalToHex = decimal;
            while (decimalToHex != 0) {
                hex = HEX.charAt(decimalToHex % 16) + hex;
                decimalToHex = decimalToHex / 16;
            }
            return hex;
        }
    }

    public static String toBinary(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }
        if (hexNumber.equals("0")) {
            return "0000";
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            int symbol = hexNumber.charAt(i);
            if (symbol < 'a' || symbol > 'f') {
                if (symbol < '0' || symbol > '9') {
                    return "";
                }
            }
        }

        String binary = String.valueOf(new StringBuilder(new String()));
        for (int i = 0; i < hexNumber.length(); i++) {
            switch (hexNumber.charAt(i)) {
                case '0':
                    binary += "0000";
                    break;
                case '1':
                    binary += "0001";
                    break;
                case '2':
                    binary += "0010";
                    break;
                case '3':
                    binary += "0011";
                    break;
                case '4':
                    binary += "0100";
                    break;
                case '5':
                    binary += "0101";
                    break;
                case '6':
                    binary += "0110";
                    break;
                case '7':
                    binary += "0111";
                    break;
                case '8':
                    binary += "1000";
                    break;
                case '9':
                    binary += "1001";
                    break;
                case 'a':
                    binary += "1010";
                    break;
                case 'b':
                    binary += "1011";
                    break;
                case 'c':
                    binary += "1100";
                    break;
                case 'd':
                    binary += "1101";
                    break;
                case 'e':
                    binary += "1110";
                    break;
                case 'f':
                    binary += "1111";
                    break;
                default:
                    return binary.toString();
            }
        }
        return binary.toString();
    }
}