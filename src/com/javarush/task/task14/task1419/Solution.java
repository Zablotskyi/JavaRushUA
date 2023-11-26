package com.javarush.task.task14.task1419;

import javax.naming.LimitExceededException;
import javax.naming.LinkException;
import javax.naming.LinkLoopException;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(new FileNotFoundException());
            exceptions.add(new RuntimeException());
            exceptions.add(new ArithmeticException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new ClassCastException());
            exceptions.add(new IOException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new LinkException());
            exceptions.add(new LimitExceededException());
            exceptions.add(new LinkLoopException());
        }

        //напишите тут ваш код

    }
}
