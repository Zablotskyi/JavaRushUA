package ua.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Шукаємо максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        /*if (numberA > numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }*/
        int max = (numberA > numberB) ? numberA : numberB;
        System.out.println(max);
    }
}
