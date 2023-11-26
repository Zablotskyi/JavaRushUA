package ua.javarush.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Перевертання даних
*/

public class Solution {
//    public static int[] numbers = new int[10];
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
//            numbers[i] = i;
            numbers.add(i);
        }
    }

    public static void reverse() {
//        int n = numbers.length - 1;
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[n - i];
//            numbers[n - i] = temp;
//        }
        Collections.reverse(numbers);
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
