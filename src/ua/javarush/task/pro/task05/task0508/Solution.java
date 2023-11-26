package ua.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишіть тут ваш код
        strings = new String[6];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (tmp.equalsIgnoreCase(strings[j])) {
                    strings[i] = "null";
                    strings[j] = "null";
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equalsIgnoreCase("null")) {
                strings[i] = null;
            }
        }
        
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
