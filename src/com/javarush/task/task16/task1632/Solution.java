package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                try {
                    throw new InterruptedException("InterruptedException");
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    public static class MyThread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class MyThread4 extends Thread implements Message {
        @Override
        public void run() {
            if (isAlive())
                showWarning();
        }

        @Override
        public void showWarning() {
            Thread.currentThread().interrupt();
        }
    }

    public static class MyThread5 extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            String number = "";
            int sum = 0;
            while (!number.equals("N")) {
                number = scanner.nextLine();
                sum = sum + Integer.parseInt(number);
            }
            System.out.println(sum);
        }
    }
}