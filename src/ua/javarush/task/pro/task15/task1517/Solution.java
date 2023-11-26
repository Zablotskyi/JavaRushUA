package ua.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файлові операції
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //напишіть тут ваш код
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
        if (Files.exists(filePath)){
            if (Files.notExists(fileNewPath)) {
                Files.move(filePath, fileNewPath);
            }
        }
        if (Files.exists(fileNewPath)){
            Files.delete(filePath);
        }
    }
}

