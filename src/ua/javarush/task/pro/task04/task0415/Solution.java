package ua.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площа круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        double pi = 3.14;
        int s = (int) (pi * radius * radius);
        System.out.println(s);
    }
}