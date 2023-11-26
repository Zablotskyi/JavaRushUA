package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String pathFile = scanner.nextLine();
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(pathFile);
            scanner = new Scanner(fis);
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            Stream<Integer> stream = numbers.stream().filter(x -> x % 2 == 0).sorted();
            stream.forEach(System.out::println);
            scanner.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
