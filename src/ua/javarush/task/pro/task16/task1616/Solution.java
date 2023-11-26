package ua.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

/* 
Тренування «Часові зони»
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишіть тут ваш код
        TreeSet<String> zoneIds = new TreeSet<>();
        for (String zone :
                ZoneId.getAvailableZoneIds()) {
            zoneIds.add(zone);
        }

        return zoneIds;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишіть тут ваш код
        ZoneId zone = ZoneId.of("Asia/Shanghai");

        return ZonedDateTime.now(zone);
    }
}
