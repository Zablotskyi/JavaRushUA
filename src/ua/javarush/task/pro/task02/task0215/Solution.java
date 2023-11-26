package ua.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Читання чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int a, b, c;
        a = console.nextInt();
        b = console.nextInt();
        c = console.nextInt();
        
        System.out.println((a + b + c) / 3);
        
        console.close();
    }
}
