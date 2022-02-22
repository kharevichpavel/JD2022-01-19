package by.it.tarend.jd01_12;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    private static String WORD = "[a-zA-Z']+";

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.nextLine();
            if (!text.equals("end")) {
                Pattern pattern = Pattern.compile(WORD);
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {
                    String word = matcher.group();
                    if (!hashMap.containsKey(word)) {
                        hashMap.put(word, 1);
                    } else {
                        hashMap.put(word, hashMap.get(word) + 1);
                    }
                }
            } else
                break;;
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
