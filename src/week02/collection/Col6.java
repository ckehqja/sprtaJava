package week02.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        /*Map : key - value pair
        * key라는 값으로 unique하게 보장이 돼야함*/

        Map<String, Integer> intMap = new HashMap<>();
        
        intMap.put("one", 11);
        intMap.put("two", 22);
        intMap.put("three", 33);
        intMap.put("four", 44);
        intMap.put("five", 35);
        intMap.put("five", 15);
        intMap.put("five", 25);

        for (String key : intMap.keySet()) {
            System.out.println("key = " + key);
        }

        for (Integer value : intMap.values()) {
            System.out.println("value = " + value);
        }

        System.out.println(intMap.get("five"));
    }
}
