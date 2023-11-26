package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Порівняймо рядки
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = sc.nextLine();
        if (s.equals(str)) {
            System.out.println("рядки однакові");
        //напишіть тут ваш код
        } else {
            System.out.println("рядки різні");
        }
    }
}
