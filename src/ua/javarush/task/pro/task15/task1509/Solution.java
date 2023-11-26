package ua.javarush.task.pro.task15.task1509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/* 
Ще раз читаємо з консолі
*/

public class Solution {
    public static void main(String[] args) {
//        try (InputStream stream = System.in;
//             InputStreamReader reader = new InputStreamReader(stream);
//             BufferedReader buff = new BufferedReader(reader)) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        }
    }
}

