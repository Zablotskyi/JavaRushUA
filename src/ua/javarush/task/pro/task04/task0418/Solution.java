package ua.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Склянка наполовину порожня чи наполовину повна?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        boolean flag = console.nextBoolean();
        
        if (flag == false) {
            System.out.println((int)Math.floor(glass));
        } else {
            System.out.println((int)Math.ceil(glass));
        }
    }
}