package ua.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Тимчасове збереження файлу
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишіть тут ваш код
        URL file = new URL(line);
        InputStream inputStream = file.openStream();

        Path tempFile = Files.createTempFile(null, null);
        Files.write(tempFile, inputStream.readAllBytes());
    }
}