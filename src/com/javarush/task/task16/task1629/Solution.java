package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        String[] stringsArray = new String[3];
        Scanner scanner;
        @Override
        public void run() {
            scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                try {
                    stringsArray[i] = reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void printResult() {
            String str = "";
            for (int i = 0; i < stringsArray.length; i++) {
                str = str + " " + stringsArray[i];
            }
            System.out.println(str);
        }
    }
}