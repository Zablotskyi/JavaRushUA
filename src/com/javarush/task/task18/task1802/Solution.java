package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        FileInputStream fis = new FileInputStream(fileName);
        byte[] array = new byte[fis.available()];
        fis.read(array);
        Arrays.sort(array);
        System.out.println(array[0]);
        scanner.close();
        fis.close();
    }
}