package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишіть тут ваш код
        grades.put("Bill", 3.8);
        grades.put("Wasyl", 5.0);
        grades.put("Jony", 4.8);
        grades.put("Sem", 4.1);
        grades.put("Jillian", 4.3);
    }
}
