package ua.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        if(a == b && a == c && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if(a == b) {
            System.out.println(a + " " + b);
        } else if(b == c) {
            System.out.println(b + " " + c);
        } else if(c == a) {
            System.out.println(c + " " + a);
        }
    }
}
