package ua.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int bottleQuantity = console.nextInt();
        int peopleQuantity = console.nextInt();
        double bottlePeople = bottleQuantity * 1.0 / peopleQuantity;
        System.out.println(bottlePeople);
    }
}