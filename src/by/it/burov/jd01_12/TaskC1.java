package by.it.burov.jd01_12;

import java.util.*;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Long, String> words = new HashMap<>();
        long key = 12345678910L;
        while (true) {
            String word = scan.nextLine();
            if (!word.equals("end")) {
                    if (!words.containsKey(word)) {
                        words.put(key, word);
                        key++;
                    } else {
                        String tempValue = words.get(key);
                        words.replace(key, tempValue);
                    }
            } else {
                break;
            }
        }
        System.out.println(words);
       extracted(words);
    }

    private static void extracted(HashMap<Long, String> words) {
        Set<String> setNames = new HashSet<>();
        Set<Long> duplicateNames = new HashSet<>();
        for (Map.Entry<Long, String> pair : words.entrySet()) {
            String word = pair.getValue();
            if (setNames.contains(word)) {
                duplicateNames.add(pair.getKey());
            } else {
                setNames.add(word);
            }
        }
        for (Long key : duplicateNames) {
            words.entrySet().removeIf(entry -> entry.getKey().equals(key));
        }
        System.out.println(words);
    }
}


