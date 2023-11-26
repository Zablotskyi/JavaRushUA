package ua.javarush.task.pro.task04.task0405;

/* 
Незаповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int n = 0;

        while (n < 10) {
            int m = 0;
            System.out.print("Б");
            while (m < 18) {
                if (n == 0 || n == 9) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");   
                }
                m++;
            }
            System.out.println("Б");
            n++;
        }
    }
}