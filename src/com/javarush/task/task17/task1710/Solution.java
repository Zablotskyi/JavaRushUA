package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        switch (args[0]) {
            case "-c": {
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], convertDataToTable(args[3])));
                } else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[1], convertDataToTable(args[3])));
                }
                System.out.println(allPeople.size() - 1);
                break;
            }
            case "-r": {
                for (int i = 0; i < allPeople.size(); i++) {
                    if (i == Integer.parseInt(args[1]))
                        System.out.println(allPeople.get(i).toString() + " " + convertDataToDisplay(allPeople.get(i).getBirthDate()));
                }
                break;
            }
            case "-u": {
                for (int i = 0; i < allPeople.size(); i++) {
                    if (i == Integer.parseInt(args[1])) {
                        allPeople.get(i).setName(args[2]);
                        if (args[3].equals("м"))
                            allPeople.get(i).setSex(Sex.MALE);
                        if (args[3].equals("ж"))
                            allPeople.get(i).setSex(Sex.FEMALE);
                        allPeople.get(i).setBirthDate(updateBirthday(args));
                    }
                }
                break;
            }
            case "-d": {
                for (int i = 0; i < allPeople.size(); i++) {
                    if (i == Integer.parseInt(args[1])) {
                        allPeople.get(i).setName(null);
                        allPeople.get(i).setSex(null);
                        allPeople.get(i).setBirthDate(null);
                    }
                }
                break;
            }
        }
    }

    public static Date convertDataToTable(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date birthday = null;
        try {
            birthday = sdf.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return birthday;
    }

    public static String convertDataToDisplay(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String dateString = sdf.format(data);
        return dateString;
    }

    public static Date updateBirthday(String[] array) {
        String dateString = array[array.length - 1];
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }
}