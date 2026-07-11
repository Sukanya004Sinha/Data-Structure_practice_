package DSAPractice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("abc","tan");
        map.put("abc","cho");
        System.out.println(map.get("abc"));
    }
}
