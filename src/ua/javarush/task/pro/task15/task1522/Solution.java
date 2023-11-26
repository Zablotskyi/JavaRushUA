package ua.javarush.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Path;

/* 
Отримання інформації через API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com.ua/api/1.0/rest/projects");
        //напишіть тут ваш код
        InputStream inputStream = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}