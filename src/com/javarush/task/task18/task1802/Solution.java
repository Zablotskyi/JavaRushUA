package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        FileInputStream fis = new FileInputStream(fileName);
        char[] array = new char[256];
        byte oneByte;

        while (fis.available() > 0) {
            oneByte = (byte) fis.read();
            array[oneByte] = 'x';
        }
        for (Character item : array) {
            if (item != null)
                System.out.println(item);
            break;
        }
    }
}