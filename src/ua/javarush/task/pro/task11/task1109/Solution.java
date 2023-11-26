package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
*/

import ua.javarush.task.pro.task11.task1109.Outer.Inner;

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
