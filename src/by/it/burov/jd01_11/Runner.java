package by.it.burov.jd01_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        proceed(list);
        list = new ListA<>();
        proceed(list);
    }

    private static void proceed(List<String> list) {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        String first = list.get(0);
        String last = list.get(3);
        System.out.printf("First -%s; Last-%s%n",first,last);
    }
}
