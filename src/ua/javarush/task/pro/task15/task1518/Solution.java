package ua.javarush.task.pro.task15.task1518;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А що там у папці?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //напишіть тут ваш код
        try(DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path path :
                    files) {
                if (Files.isDirectory(path)) {
                    System.out.println(path + THIS_IS_DIR);
                } else if (Files.isRegularFile(path)){
                    System.out.println(path + THIS_IS_FILE);
                }
            }
        }
    }
}

