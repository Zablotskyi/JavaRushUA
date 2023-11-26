package ua.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Мінімальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int min = 0;
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
