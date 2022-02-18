package by.it.skorobogatyi.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskB2 {

    public static final int NUMBER = 10;
    public static int counter;

    public static void main(String[] args) {


        ArrayList<String> peoplesInArrayList = new ArrayList<>();
        LinkedList<String> peoplesInLinkedList = new LinkedList<>();

        for (int i = 1; i < NUMBER + 1; i++) {
            peoplesInArrayList.add(Integer.toString(i));
            peoplesInLinkedList.add(Integer.toString(i));

        }
        String restInArrayList = process(peoplesInArrayList);

        String restInLinkedList = process(peoplesInLinkedList);


    }

    static String process(ArrayList<String> peoples) {
        Iterator<String> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
            if (counter % 2 == 0) {
                iterator.remove();
            }
        }
        if (peoples.size() > 1) {
            process(peoples);
        }
        counter = 0;
        return peoples.get(0);
    }

    static String process(LinkedList<String> peoples) {
        Iterator<String> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
            if (counter % 2 == 0) {
                iterator.remove();
            }
        }
        if (peoples.size() > 1) {
            process(peoples);
        }
        counter = 0;
        return peoples.get(0);
    }
}
