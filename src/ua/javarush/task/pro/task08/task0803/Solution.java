package ua.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Мінімальний елемент масиву
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишіть тут ваш код
        int min = Integer.MAX_VALUE;
        int tmp;

        for (int i = 0; i < ints.length - 1; i++) {
            tmp = Math.min(ints[i], ints[i + 1]);
            if (tmp < min) {
                min = tmp;
            }
        }
        return min;
    }
    static int[] array = new int[10];
    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        //напишіть тут ваш код
        int number;
        for (int i = 0; i < 10; i++) {
            number = console.nextInt();
            array[i] = number;
        }
        return array;
    }
}
