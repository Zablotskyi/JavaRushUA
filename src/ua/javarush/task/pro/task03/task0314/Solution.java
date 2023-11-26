package ua.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Поламана клавіатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if (password.equalsIgnoreCase(secret)) {
            System.out.println("доступ дозволено");
        } else {
        //напишіть тут ваш код
            System.out.println("доступ заборонено");
        }
    }
}
