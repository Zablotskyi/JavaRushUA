package ua.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Швидкість вітру
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int windSpeedMeter = console.nextInt();
        double windSpeedKmeter = windSpeedMeter * 3.6;
        int result = (int) Math.round(windSpeedKmeter);
        System.out.println(result);
    }
}