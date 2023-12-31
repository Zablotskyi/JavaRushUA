package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country == Country.UKRAINE)
                return hen = new UkrainianHen();
            else if (country == Country.MOLDOVA)
                return hen = new MoldovanHen();
            else if (country == Country.BELARUS)
                return hen = new BelarusianHen();
            else if (country == Country.RUSSIA)
                return hen = new RussianHen();
            else
                return null;
        }
    }
}
