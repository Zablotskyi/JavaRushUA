package ua.javarush.task.pro.task05.task0518;

import java.util.Arrays;

import static java.util.Arrays.*;

/* 
Сортування масиву
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //напишіть тут ваш код
        Arrays.sort(array);
        String str = Arrays.toString(array);
        System.out.println(str);
    }
}
