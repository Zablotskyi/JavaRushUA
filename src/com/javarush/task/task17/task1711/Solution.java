package com.javarush.task.task17.task1711;

import java.sql.SQLOutput;
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
//                for (int i = 0; i < allPeople.size(); i++) {
//                    if (i == Integer.parseInt(args[1])) {
//                        allPeople.get(i).setName(args[2]);
//                        if (args[3].equals("м"))
//                            allPeople.get(i).setSex(Sex.MALE);
//                        if (args[3].equals("ж"))
//                            allPeople.get(i).setSex(Sex.FEMALE);
//                        allPeople.get(i).setBirthDate(updateBirthday(args));
//                    }
//                }
                for (Person person : allPeople)
                    System.out.println(person.toString());
                break;
            }
            case "-d": {
//                for (int i = 0; i < allPeople.size(); i++) {
//                    if (i == Integer.parseInt(args[1])) {
//                        allPeople.get(i).setName(null);
//                        allPeople.get(i).setSex(null);
//                        allPeople.get(i).setBirthDate(null);
//                    }
//                }
                for (Person person : allPeople)
                    System.out.println(person.toString());
                break;
            }
            case "-i": {
                for (int i = 0; i < onePeopleInRow[0].length; i++) {
                    for (int j = 0; j <allPeople.size(); j++) {
                        if (allPeople.get(j) != null)
                            if (Integer.parseInt(onePeopleInRow[0][i]) == j)
                            System.out.println(allPeople.get(j).toString() + " " + convertDataToDisplay(allPeople.get(j).getBirthDate()));
                    }
                }
//                for (int i = 0; i < allPeople.size(); i++) {
//                    if (i == Integer.parseInt(args[1]))
//                        System.out.println(allPeople.get(i).toString() + " " + convertDataToDisplay(allPeople.get(i).getBirthDate()));
//                }
                for (Person person : allPeople)
                    System.out.println(person.toString());
                break;
            }
        }
    }

    /*Utilities methods*/
    protected static String[][] parseLineToArray(String[] arrays) {
        String[][] arrayParameters = new String[arrays.length][arrays.length];
        switch (arrays[0]) {
            case "-c": {
                int count = 1;
                for (int i = 0; i < arrays.length; i++) {
                    if (count == arrays.length)
                        break;
                    for (int j = 0; j < 3; j++) {
                        arrayParameters[i][j] = arrays[count];
                        count++;
                    }
                }

                break;
            }
            case "-u": {
                int count = 1;
                for (int i = 0; i < arrays.length; i++) {
                    if (count == arrays.length)
                        break;
                    for (int j = 0; j < 4; j++) {
                        arrayParameters[i][j] = arrays[count];
                        count++;
                        System.out.println(arrayParameters[i][j]);
                    }
                }
                break;
            }
            case "-d", "-i": {
                for (int i = 1; i < arrays.length; i++) {
                    arrayParameters[0][i] = arrays[i];
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