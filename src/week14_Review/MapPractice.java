package week14_Review;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();

        properties.put("browser", "chrome");
        properties.put("cydeo.url", "http://www.cydeo.com");
        properties.put("dice.url", "http://www.dice.com");
        properties.put("username", "helpdesk1@cydeo.com");
        properties.put("password", "UserUser");

        System.out.println(properties);

        System.out.println(properties.get("browser"));   // will retrieve value for key "browser"

        String browser = properties.get("browser");
        if (browser.equals("chrome")) {
            System.out.println("Chrome Driver is selected");
        } else if (browser.equals("firefox")) {
            System.out.println("Firefox Driver is selected");
        }else{
            throw new RuntimeException("Invalid Browser");
        }

        System.out.println(properties.get("cydeo.url"));
    }
}
