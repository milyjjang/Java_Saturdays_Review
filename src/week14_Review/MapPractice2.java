package week14_Review;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map <String, Object> value = new HashMap<>();
        value.put("id", "A01");
        value.put("age", 28);
        value.put("job_title", "Java Developer");
        value.put("salary", 100000);
        value.put("full_time", true);

        Map <String, Map <String, Object>> employee1 = new HashMap<>();
        employee1.put("Oleksandr", value);

        System.out.println(employee1);
    }
}
