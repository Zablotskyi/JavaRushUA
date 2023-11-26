package ua.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/* 
Поверхневе копіювання
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишіть тут ваш код
        try(DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path :
                    files) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path);
                    Files.copy(path, targetDirectory.resolve(path.getFileName()));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}