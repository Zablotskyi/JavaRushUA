package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        String s;
        int sum = 0;
        int number = 0;
        
        while (console.hasNext()) {
            s = console.nextLine();
            if (s.equals("ENTER")) {
                break;
            }
            number = Integer.parseInt(s);
            sum += number;
        }
        System.out.println(sum);
    }
}