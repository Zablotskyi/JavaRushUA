package ua.javarush.task.pro.task18.task1813;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Майбутнє — за електромобілями
*/

public class Solution {

    public static void main(String[] args) {
        var cars = new ArrayList<Car>();
        Collections.addAll(cars,
                new Car("Range Rover", false),
                new Car("Model S", true),
                new Car("Navigator", false),
                new Car("Model 3", true),
                new Car("Camaro", false),
                new Car("Escalade", false),
                new Car("Mustang", false),
                new Car("Model X", true),
                new Car("X5", false),
                new Car("Model Y", true));

        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }

    public static Stream<Car> onlyElectricCars(ArrayList<Car> cars) {
        //напишіть тут ваш код
        Stream<Car> stream = cars.stream().filter(Car::isElectric);
        return stream;
    }
}