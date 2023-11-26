package ua.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList і HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

//    public static ArrayList<String> getProgrammingLanguages() {
    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишіть тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
//        return programmingLanguages;
        HashMap <Integer, String> programmingLanguagesHashMap = new HashMap<Integer, String>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            programmingLanguagesHashMap.put(i, programmingLanguages.get(i));
        }

        return programmingLanguagesHashMap;
    }
}
