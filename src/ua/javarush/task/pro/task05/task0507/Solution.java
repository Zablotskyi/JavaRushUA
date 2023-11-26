package ua.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
