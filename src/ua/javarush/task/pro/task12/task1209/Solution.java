package ua.javarush.task.pro.task12.task1209;

import java.util.ArrayList;
import java.util.Collections;

/* 
Бухгалтерія
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишіть тут ваш код
        if (name == null) {
            return;
        }
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int index = Collections.binarySearch(waitingEmployees, name);
            waitingEmployees.set(index, null);
        }
    }
}
