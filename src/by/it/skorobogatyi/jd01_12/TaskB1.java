package by.it.skorobogatyi.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*TaskB1. Нужно ввести с консоли текст на английском языке до строки “end” (100 и
более слов).
 Для каждого слова с помощью коллекций подсчитать частоту его встречаемости.
 Вывести все различные слова формате слово=частота. Слова, отличающиеся
регистром букв, считать различными. isn't или don’t – одно слово.*/
public class TaskB1 {

    public static final String SIGNS = "[\\p{P}&&[^'-]]";

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String entry = scanner.next();
            if (entry.equals("end")) {
                break;
            } else {
                entry = entry.replaceAll(SIGNS, "");
                if (entry != "") {
                    if (!map.containsKey(entry)) {
                        map.put(entry, 1);
                    } else {
                        int value = map.get(entry);
                        map.replace(entry, value, value + 1);
                    }
                }
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}
