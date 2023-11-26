package ua.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Читання і перетворення рядків
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        String lineOne = console.nextLine();
        String lineTwo = console.nextLine();
        String lineThree = console.nextLine();
        
        System.out.println(lineThree);
        System.out.println(lineTwo.toUpperCase());
        System.out.println(lineOne.toLowerCase());

    }
}
