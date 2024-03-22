package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    private static String[][] onePeopleInRow;
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        //-c Миронов м 15/04/1990 Миронова ж 25/04/1997
        //-u 0 Миронов м 15/04/1990 1 Миронова ж 25/04/1997
        //-d 0 1
        //-i 1

        onePeopleInRow = parseLineToArray(args);
        switch (args[0]) {
            case "-c": {
                for (int i = 0; i < onePeopleInRow.length; i++) {
                    if (onePeopleInRow[i][1] != null) {
                        if (onePeopleInRow[i][1].equals("м")) {
                            allPeople.add(Person.createMale(onePeopleInRow[i][0], convertDataToTable(onePeopleInRow[i][2])));
                            System.out.println(i);
                        } else if (onePeopleInRow[i][1].equals("ж")) {
                            allPeople.add(Person.createFemale(onePeopleInRow[i][0], convertDataToTable(onePeopleInRow[i][2])));
                            System.out.println(i);
                        }
                    }
                }
            }
            case "-u": {
                int id;
                for (int i = 0; i < onePeopleInRow.length; i++) {
                    if (onePeopleInRow[i][0] != null) {
                        if (!onePeopleInRow[i][0].isEmpty()) {
                            id = Integer.parseInt(onePeopleInRow[i][0]);
                            for (int j = 0; j < allPeople.size(); j++) {
                                if (id == j) {
                                    allPeople.get(j).setName(onePeopleInRow[i][1]);
                                    if (onePeopleInRow[i][2].equals("м"))
                                        allPeople.get(j).setSex(Sex.MALE);
                                    if (onePeopleInRow[i][2].equals("ж"))
                                        allPeople.get(j).setSex(Sex.FEMALE);
                                    allPeople.get(j).setBirthDate(updateBirthday(onePeopleInRow[i][3]));
                                }
                            }
                        }
                    }
                }
                break;
            }
            case "-d": {
                int id;
                for (int i = 0; i < onePeopleInRow[0].length; i++) {
                    if (onePeopleInRow[0][i] != null) {
                        id = Integer.parseInt(onePeopleInRow[0][i]);
                        for (int j = 0; j < allPeople.size(); j++) {
                            if (id == j) {
                                allPeople.get(j).setName(null);
                                allPeople.get(j).setSex(null);
                                allPeople.get(j).setBirthDate(null);
                            }
                        }
                    }
                }
                break;
            }
            case "-i": {
                int id;
                for (int i = 0; i < onePeopleInRow[0].length; i++) {
                    if (onePeopleInRow[0][i] != null) {
                        id = Integer.parseInt(onePeopleInRow[0][i]);
                        for (int j = 0; j < allPeople.size(); j++) {
                            if (id == j)
                                System.out.println(allPeople.get(j).toString() + " " + convertDataToDisplay(allPeople.get(j).getBirthDate()));
                        }
                    }
                }
            }
        }
    }

    /*Utilities methods*/
    protected static String[][] parseLineToArray(String[] argArray) {
        String[][] arrayParameters = new String[argArray.length][argArray.length];
        switch (argArray[0]) {
            case "-c": {
                int count = 1;
                for (int i = 0; i < argArray.length; i++) {
                    if (count == argArray.length)
                        break;
                    for (int j = 0; j < 3; j++) {
                        arrayParameters[i][j] = argArray[count];
                        count++;
                    }
                }

                break;
            }
            case "-u": {
                int count = 1;
                for (int i = 0; i < argArray.length; i++) {
                    if (count == argArray.length)
                        break;
                    for (int j = 0; j < 4; j++) {
                        arrayParameters[i][j] = argArray[count];
                        count++;
                    }
                }
                break;
            }
            case "-d": {
                int count = 1;
                for (int i = 0; i < argArray.length; i++) {
                    arrayParameters[0][i] = argArray[count];
                    count++;
                    if (count == argArray.length)
                        break;
                }
                break;
            }
            case "-i": {
                int count = 1;
                for (int i = 0; i < argArray.length; i++) {
                    arrayParameters[0][i] = argArray[count];
                    count++;
                    if (count == argArray.length)
                        break;
                }
                break;
            }
        }
        return arrayParameters;
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

    public static Date updateBirthday(String data) {
        String dateString = data;
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