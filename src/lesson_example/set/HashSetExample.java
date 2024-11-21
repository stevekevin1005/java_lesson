package lesson_example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 創建一個 HashSet
        Set<String> set = new HashSet<>();

        // 添加元素
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // 重複的元素不會被添加

        // 檢查元素是否存在
        System.out.println("Contains 'Apple': " + set.contains("Apple")); // true
        System.out.println("Contains 'Grapes': " + set.contains("Grapes")); // false

        // 刪除元素
        set.remove("Banana");

        // 遍歷元素
        System.out.println("Elements in set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 顯示 Set 的大小
        System.out.println("Set size: " + set.size()); // 2

        // 清空 Set
        set.clear();
        System.out.println("Is set empty: " + set.isEmpty()); // true
    }
}
