package ua.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arrayInt = new int[n];
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                arrayInt[i] = console.nextInt();
            }
        }
        if (n % 2 != 0) {
            for (int i = 0; i < arrayInt.length; i++) {
                System.out.println(arrayInt[i]);
            }
        } else {
            for (int i = 0; i < arrayInt.length; i++) {
                System.out.println(arrayInt[arrayInt.length - i - 1]);
            }
        }
    }
}
