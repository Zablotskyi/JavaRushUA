package ua.javarush.task.pro.task15.task1516;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл чи директорія
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) {
        //напишіть тут ваш кодInteger
        Path path = null;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                path = Path.of(scanner.nextLine());
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                } else if (Files.isDirectory(path)){
                    System.out.println(path + THIS_IS_DIR);
                }
            }
            while (Files.exists(Path.of(path.toString())));
        }
    }
}

