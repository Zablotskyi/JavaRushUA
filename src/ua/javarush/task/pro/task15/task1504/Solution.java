package ua.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Переплутані байти
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        InputStream inputStream = null;
        OutputStream outputStream = null;
        Scanner scanner = new Scanner(System.in);
        byte[] buffer = new byte[2];

        try {
            inputStream = Files.newInputStream (Path.of(scanner.nextLine()));
            outputStream = Files.newOutputStream (Path.of(scanner.nextLine()));
            try {
                while (inputStream.available() > 0) {
                    int real = inputStream.read(buffer);
                    if (real % 2 == 0) {
                        swapArraysElements(buffer);
                        outputStream.write(buffer, 0, real);
                    } else {
                        outputStream.write(buffer[0]);
                    }
                }
            } catch (IOException e) {
                throw new IOException();
            }  finally {
                inputStream.close();
                outputStream.close();
                scanner.close();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void swapArraysElements(byte[] array) {
        byte tmp;
        tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
}

