package ua.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаємо не всіх
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        List<String> stringList = new ArrayList<>();
        try(Scanner scanner = new Scanner(System.in)) {
            stringList = Files.readAllLines(Paths.get(scanner.nextLine()));
            
            for (int i = 0; i < stringList.size(); i += 2) {
                System.out.println(stringList.get(i));
            }
        }
    }
}

