package ua.javarush.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Вивчаємо методи класу Collections, частина 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
//        Integer minimum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < minimum) {
//                minimum = list.get(i);
//            }
//        }
        Integer minimum = Collections.min(list);
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
//        Integer maximum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > maximum) {
//                maximum = list.get(i);
//            }
//        }
        Integer maximum = Collections.max(list);
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
//        if (element == null) {
//            return frequency;
//        } else {
//            for (Integer integer : list) {
//                if (element.equals(integer)) {
//                    frequency++;
//                }
//            }
//        }
        frequency = Collections.frequency(list, element);
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
//        int low = 0;
//        int high = list.size() - 1;
//        int mid = (low + high) / 2;
//        int index = -1;
//        while (low <= high) {
//            if (list.get(mid) < key) {
//                low = mid + 1;
//            } else if (list.get(mid).equals(key)) {
//                index = mid;
//                break;
//            } else {
//                high = mid - 1;
//            }
//            mid = (low + high) / 2;
//        }
        int index = Collections.binarySearch(list, key);
        return index;
    }
}