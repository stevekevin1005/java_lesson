package lesson_example.map;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "orange", "banana"};
        Map<String, Boolean> map = new HashMap<>();

        for (String s : array) {
            map.put(s, true); // 只保存唯一的鍵
        }

        System.out.println(map.keySet());  // [apple, banana, orange]
    }
}

