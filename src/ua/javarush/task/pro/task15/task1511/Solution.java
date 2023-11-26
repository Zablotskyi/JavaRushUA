package ua.javarush.task.pro.task15.task1511;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

/* 
Пишемо символи у файл
*/

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            bufferedWriter.write(chars);
//            Files.write(Path.of(scanner.nextLine()), chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


