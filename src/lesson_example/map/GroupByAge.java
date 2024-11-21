package lesson_example.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByAge {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 18));
        students.add(new Student("Bob", 19));
        students.add(new Student("Charlie", 18));

        Map<Integer, List<String>> ageGroup = new HashMap<>();

        for (Student student : students) {
            ageGroup.putIfAbsent(student.age, new ArrayList<>());
            ageGroup.get(student.age).add(student.name);
        }

        System.out.println(ageGroup);  // {18=[Alice, Charlie], 19=[Bob]}
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
