package by.it.tarend.jd01_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        processList(list);
        list = new ListA<>();
        processList(list);
        list = new ListB<>();
        processList(list);
    }

    private static void processList(List<String> list) {
        System.out.printf("----------- %s -----------%n", list.getClass().getSimpleName());
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five"); // add
        System.out.println(list); // toString
        list.remove(2); // remove
        System.out.println(list);
        System.out.println(list.get(0));
//        System.out.println("Iteration loop");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
        list.set(2, "ten");
        System.out.println(list);
        list.add(1, "six");
        System.out.println(list);
        list.addAll(list);
        System.out.println(list);


    }


}
