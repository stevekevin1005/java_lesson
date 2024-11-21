package lesson_example.set;

import java.util.HashSet;
import java.util.Set;

public class SetOperationExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        set2.add("Banana");
        set2.add("Grapes");
        set2.add("Orange");

        // 聯集
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union); // [Apple, Banana, Orange, Grapes]

        // 交集
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection); // [Banana, Orange]

        // 差集
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference); // [Apple]
    }
}
