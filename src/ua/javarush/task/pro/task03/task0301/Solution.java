package ua.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло чи холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на вулиці холодно";
        String warm = "на вулиці тепло";
        //напишіть тут ваш код
        int temperature;
        Scanner scanner = new Scanner(System.in);
        temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("на вулиці холодно");
        } else {
            System.out.println("на вулиці тепло");
        }
    }
}
