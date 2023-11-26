package ua.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Усі люблять Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любить мене.";
        //напишіть тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
        while(count < 10) {
            System.out.println(name + " любить мене.");
            count++;
        }
    }
}
