package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int row = console.nextInt();
        if (row > 0) {
            multiArray = new int[row][];
        }
        int coll;
        for (int i = 0; i < row; i++) {
            coll = console.nextInt();
            if (coll > 0) {
                multiArray[i] = new int[coll];
            }
        }
    }
}
