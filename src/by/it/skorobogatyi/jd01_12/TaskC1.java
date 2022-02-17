package by.it.skorobogatyi.jd01_12;

import java.util.*;

public class TaskC1 {

    public static int counter = 0;
    static HashMap<Integer, String> map = new HashMap<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            stringBuilder.append(entry).append("\n");
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String entry = scanner.next();
            if (entry.equals("end")) {
                break;
            } else {
                map.put(counter, entry);
                counter++;
            }
        }

        System.out.println(map.toString());

        HashMap<String, Integer> newMap = new HashMap<>();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            if (!newMap.containsKey(entry.getValue())) {
                newMap.put(entry.getValue(), entry.getKey());
            }
        }

        map.clear();

        Set<Map.Entry<String, Integer>> entriesNew = newMap.entrySet();
        for (Map.Entry<String, Integer> entry : entriesNew) {
                map.put(entry.getValue(), entry.getKey());
            }

        System.out.println(map.toString());


    }
}
