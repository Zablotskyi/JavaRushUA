package ua.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призовна кампанія
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", з'явіться до військкомату";
        //напишіть тут ваш код
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        age = scanner.nextInt();
        if(age >= 18 && age <= 26) {
            System.out.println(name + militaryCommissar);
        }
    }
}
