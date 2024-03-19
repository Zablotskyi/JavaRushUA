package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        readFromFile(firstFileName, allLines);
        readFromFile(secondFileName, forRemoveLines);
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null)
            scanner.close();
        }
    }

    public void joinData() throws CorruptedDataException {
        int count = 0;
        for (int i = 0; i < forRemoveLines.size(); i++) {
            for (int j = 0; j < allLines.size(); j++) {
                if (forRemoveLines.get(i).equals(allLines.get(j)))
                    count++;
                allLines.set(j, null);
            }
        }
        if (count == forRemoveLines.size())
            allLines.clear();
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

    public static void readFromFile(String fileName, List<String> list) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}