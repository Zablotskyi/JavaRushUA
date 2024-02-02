package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String delimiter = "\\?";
        String[] parameters = url.split(delimiter);
        String[] parameter = parameters[1].split("&");
        for (int i = 0; i < parameter.length; i++) {
            int equalsIndex = parameter[i].indexOf("=");
            if (parameter[i].contains("=")) {
                System.out.print(parameter[i].substring(0, equalsIndex) + " ");
                continue;
            }
            System.out.print(parameter[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < parameter.length; i++) {
            if (parameter[i].contains("obj")) {
                String[] tmp = parameter[i].split("=");
                try {
                    alert(Double.parseDouble(tmp[1]));
                } catch (NumberFormatException e) {
                    alert(tmp[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
