package by.it._classwork_.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, i * i);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
