package lesson_example.map;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("John", 85);
        grades.put("Jane", 92);
        grades.put("Jim", 78);

        System.out.println("John's grade: " + grades.get("John"));  // 85
        System.out.println("Jane's grade: " + grades.get("Jane"));  // 92
    }
}
