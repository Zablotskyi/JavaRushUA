package ua.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код

        try (Scanner scanner = new Scanner(System.in)) {
            String source = Files.readAllLines(Paths.get(scanner.nextLine())).toString();
            String symbol = "";
            for (int i = 0; i < source.length(); i++) {
                if (source.charAt(i) != 32 &&
                        source.charAt(i) != 46 &&
                        source.charAt(i) != 44) {
                    symbol += source.charAt(i);
                }
            }
            System.out.println(symbol.substring(1, symbol.length() - 1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

