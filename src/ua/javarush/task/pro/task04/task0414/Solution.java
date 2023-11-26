package ua.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошого забагато не буває
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int count = console.nextInt();
        
        if (count <= 0 || count >=5) {
            System.out.println(s);
        } else {
            do {
                System.out.println(s);
                count--;
            }
            while(count > 0);
        }
    }
}