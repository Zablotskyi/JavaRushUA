package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter;
        String filePath;
        String line;

        try {
            filePath = bufferedReader.readLine();
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
            do {
                line = bufferedReader.readLine();
                list.add(line);
            } while (!line.equals("exit"));

            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
