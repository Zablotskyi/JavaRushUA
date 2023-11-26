package ua.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишіть тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] tokenArray = new String [tokenizer.countTokens()];
        int count = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            tokenArray[count] = token;
            count++;
        }
        return tokenArray;
    }
}
