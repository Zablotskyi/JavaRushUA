package ua.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатні чверті
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int x, y;
        
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        if (x > 0 && y > 0) {
            System.out.println("1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("2");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("4");
        }
    }
}
