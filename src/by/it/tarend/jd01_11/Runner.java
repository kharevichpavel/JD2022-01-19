package by.it.tarend.jd01_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {

/*        List<String> list = new ArrayList<>();
        processList(list);
        list = new ListA<>();
        processList(list);
        list = new ListB<>();
        processList(list);*/

        Set<String> set = new HashSet<>();
        processSet(set);
        set = new SetC<>();
        processSet(set);
    }

    private static void processSet(Set<String> set) {
        System.out.printf("----------- %s -----------%n", set.getClass().getSimpleName());
        set.add("one");
        set.add("two");
        set.add("tree");
        set.add("four");
        set.add("five");
        set.add("one");
        System.out.println(set);
        set.remove("two");
        System.out.println(set);
        System.out.println("Is one: " + set.contains("one") + "  Is two: " + set.contains("two"));
        System.out.println("Size: " + set.size());
        System.out.println("Is Empty: " + set.isEmpty());
        Set<String> newSet = new HashSet<>();
        newSet.add("2"); newSet.add("3"); newSet.add("tree");
        set.addAll(newSet);
        System.out.println(set);
        System.out.println("Is contain set: " + set.containsAll(set));
        set.removeAll(newSet);
        System.out.println(set);
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
        list.set(2, "ten");
        System.out.println(list);
        list.add(1, "six");
        System.out.println(list);
        list.addAll(list);
        System.out.println(list);


    }


}
