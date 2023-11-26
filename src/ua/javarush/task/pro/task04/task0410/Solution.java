package ua.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Друге мінімальне число серед уведених
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        int number = 0;

        while(console.hasNextInt()) {
            number = console.nextInt();
            if(number < min) {
                minTwo = min;
                min = number;
            } else if(number > min && number < minTwo) {
                minTwo = number;
            }
        }
        System.out.println(minTwo);
    }
}