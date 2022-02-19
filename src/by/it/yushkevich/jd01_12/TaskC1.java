package by.it.yushkevich.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TaskC1 {

    static HashMap<Integer, String> map = new HashMap<>();
    static HashMap<Integer, String> newMap = new HashMap<>();
    private static Scanner scanner;

    public static void main(String[] args) {

        fillingMap(map);
        removalDubbled(map,newMap);

    }

    private static void fillingMap(HashMap<Integer, String> map) {

        scanner = new Scanner(System.in);
        int counter = 0;
        //Filling map
        while (scanner.hasNext()) {
            String text = scanner.next();
            if (!text.equals("end")) {
                map.put(counter, text);
                counter++;
            } else {
                break;
            }
        }
        System.out.println(map.toString());
    }

    // из одной мэпки скопируем неповторяющиеся элементы во вторую/
    private static void removalDubbled(HashMap<Integer, String> map, HashMap<Integer, String> newMap) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {

            String mapValue = entry.getValue();
            Integer mapKey = entry.getKey();

            if (!newMap.containsValue(mapValue)) {
                newMap.put(mapKey, mapValue);
            }
        }

        System.out.println(newMap.toString());
    }
}
//можно почистить первоначальную мэпку и обратно все переписать. но и так работает
//        map.clear();
//
//        Set<Map.Entry<Integer, String>> newEntrySet = newMap.entrySet();
//        for (Map.Entry<Integer, String> newOne : newEntrySet) {
//            Integer key = newOne.getKey();
//            String value = newOne.getValue();
//            map.put(key,value);
//
//        }