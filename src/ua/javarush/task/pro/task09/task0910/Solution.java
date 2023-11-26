package ua.javarush.task.pro.task09.task0910;

/* 
Кодування Unicode
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        //напишіть тут ваш код
        HashMap<Integer, Character> chars = new HashMap<>();
        chars.put(0, '\u00A9');
        chars.put(1, '\u004A');
        chars.put(2, '\u0061');
        chars.put(3, '\u0076');
        chars.put(4, '\u0061');
        chars.put(5, '\u0052');
        chars.put(6, '\u0075');
        chars.put(7, '\u0073');
        chars.put(8, '\u0068');

        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = chars.get(i);
        }
    }
}

