package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Висока точність
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        boolean result = ((Math.abs(a-b)) < 0.000001);
        System.out.println(result == true ? "числа рівні" : "числа не рівні");
        //напишіть тут ваш код
    }
}
