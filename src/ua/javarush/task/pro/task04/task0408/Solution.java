package ua.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int number = 0;
        int max = Integer.MIN_VALUE;

        while (console.hasNextInt()) {
            number = console.nextInt();
            
            if(number % 2 == 0 && number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}