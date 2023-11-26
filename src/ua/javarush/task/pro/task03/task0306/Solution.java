package ua.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Трикутник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        //напишіть тут ваш код
        int a, b, c;
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a < b + c && b < a + c && c < a + b) {
            System.out.println("трикутник існує");
        } else {
            System.out.println("трикутник не існує");
        }
    }
}
