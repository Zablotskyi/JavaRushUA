package ua.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Усе відносне
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишіть тут ваш код
        Path relativize;
        Path absolutePathFirst = Path.of(str1);
        Path absolutePathSecond = Path.of(str2);

        try {
            relativize = absolutePathFirst.relativize(absolutePathSecond);
        } catch (IllegalArgumentException i) {
            try {
                relativize = absolutePathSecond.relativize(absolutePathFirst);
            } catch (IllegalArgumentException i2) {
                relativize = null;
            }
        }
        if (relativize != null) {
            System.out.println(relativize.toString());
        }
    }
}

