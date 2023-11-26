package ua.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

/*
Назворот
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        //напишіть тут ваш код

        String reverseString = new StringBuilder(result).reverse().toString();
        outputStream.reset();
        printSomething(reverseString);

        System.out.println(reverseString);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}