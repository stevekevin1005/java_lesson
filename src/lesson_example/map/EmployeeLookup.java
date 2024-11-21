package lesson_example.map;

import java.util.HashMap;
import java.util.Map;

public class EmployeeLookup {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("E123", "Alice");
        employeeMap.put("E124", "Bob");
        employeeMap.put("E125", "Charlie");

        String employeeName = employeeMap.get("E124");
        System.out.println("Employee E124: " + employeeName); // Bob
    }
}
