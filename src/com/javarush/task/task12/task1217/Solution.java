package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add interfaces here - добавь интерфейсы тут
    public static interface CanFly {
        static void canFly() {
            System.out.println("CanFly");
        }
    }

    public static interface CanRun {
        static void canRun() {
            System.out.println("CanRun");
        }
    }

    public static interface CanSwim {
        static void canSwim() {
            System.out.println("CanSwim");
        }
    }

}
