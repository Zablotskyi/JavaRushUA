package ua.javarush.task.pro.task07.task0705;

/* 
Нескінченність — не межа
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        double infinity = 1d / 0d;
        div(0d, infinity);
        div(-0d, infinity);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
