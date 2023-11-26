package ua.javarush.task.pro.task09.task0914;

/* 
Оновлення шляху
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишіть тут ваш код
        String newPath;
        int index = path.indexOf("jdk");
        int slash = path.indexOf("/", index);
        String indexFirst = path.substring(0, index);
        String indexSecond = path.substring(slash, path.length());
        newPath = indexFirst + jdk + indexSecond;
        return newPath;
    }
}
