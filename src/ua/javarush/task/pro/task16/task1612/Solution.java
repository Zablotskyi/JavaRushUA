package ua.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезуємо LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишіть тут ваш код
        Set<LocalDateTime> setDateTime = new HashSet<>() {
        };
        LocalDateTime dateTime;
        for (Map.Entry<LocalDate, List<LocalTime>> entry :
                sourceMap.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                dateTime = LocalDateTime.of(entry.getKey(), entry.getValue().get(i));
                setDateTime.add(dateTime);
            }
        }
        return setDateTime;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}