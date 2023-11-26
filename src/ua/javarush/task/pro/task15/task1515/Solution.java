package ua.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютний шлях
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишіть тут ваш код
        Path absolutePath = Path.of(str);
        if (absolutePath.isAbsolute()) {
            System.out.println(absolutePath);
        } else {
            System.out.println(absolutePath.toAbsolutePath());
        }
    }
}

