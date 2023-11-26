package ua.javarush.task.pro.task05.task0509;

/* 
Таблиця множення
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишіть тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 1; i <= MULTIPLICATION_TABLE.length; i++) {
            for (int j = 1; j <= MULTIPLICATION_TABLE.length; j++) {
                MULTIPLICATION_TABLE[i - 1] [j - 1] = i * j;
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
