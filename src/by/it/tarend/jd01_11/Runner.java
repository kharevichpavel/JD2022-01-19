package by.it.tarend.jd01_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        processList(list);
        list  = new LinkedList<>();
        processList(list);
        list = new ListA<>();
        processList(list);
    }

    private static void processList(List<String> list) {
        System.out.printf("----------- %s -----------%n", list.getClass().getSimpleName());
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
        System.out.printf("first element %s \t last element %s%n", first, last);
        System.out.println("Iteration loop");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }


}
