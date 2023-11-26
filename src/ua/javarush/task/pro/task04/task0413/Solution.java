package ua.javarush.task.pro.task04.task0413;

/* 
Креслимо трикутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        for(int i = 0; i < 10; i++) {
            for(int j = 10; j >= 10 - i; j--) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}