package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = null;

//        System.out.println("Введіть повну адресу і назву файлу з його розширенням:");
        String path = null;

        try {
            path = bufReader.readLine();
            input = new FileInputStream(path);

            while (input.available() > 0) {
                int symbol = input.read();
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufReader.close();
                input.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}