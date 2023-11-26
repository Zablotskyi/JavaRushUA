package ua.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Мінімум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int i = 0;
        int min = Integer.MAX_VALUE;
        
        while(console.hasNextInt()) {
            i = console.nextInt();
            if(i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}