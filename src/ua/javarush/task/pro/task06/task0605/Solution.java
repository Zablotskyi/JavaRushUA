package ua.javarush.task.pro.task06.task0605;

/* 
Правильний порядок
*/

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишіть тут ваш код
        for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            swap(array, start, end);
        }
    }
    public static void swap(int[] numbers, int a, int b) {
        int tmp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
