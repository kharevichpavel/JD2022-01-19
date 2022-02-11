package by.it.skorobogatyi.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        System.out.println(strings);

        strings.remove(2);
        System.out.println(strings);

        String first = strings.get(0);
        String last = strings.get(strings.size());
        System.out.printf("first = %s, last = %s%n", first, last);
    }
}
