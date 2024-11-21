package lesson_example.map;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    public static void main(String[] args) {
        Map<String, String> config = new HashMap<>();
        config.put("server", "localhost");
        config.put("port", "8080");
        config.put("timeout", "5000");

        System.out.println("Server: " + config.get("server"));  // localhost
        System.out.println("Port: " + config.get("port"));      // 8080
    }
}
