package lesson_example.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // 創建 HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 插入鍵值對
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // 打印整個 Map
        System.out.println("Initial Map: " + map);

        // 根據 Key 獲取 Value
        String value = map.get(2);
        System.out.println("Value for Key 2: " + value);

        // 更新 Key 的 Value
        map.put(2, "Blueberry");
        System.out.println("Updated Map: " + map);

        // 檢查是否包含某個 Key 或 Value
        System.out.println("Contains Key 1? " + map.containsKey(1));
        System.out.println("Contains Value 'Cherry'? " + map.containsValue("Cherry"));

        // 刪除鍵值對
        map.remove(3);
        System.out.println("After Removing Key 3: " + map);

        // 遍歷 Map 的 Key 和 Value
        System.out.println("Iterating over Map:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
