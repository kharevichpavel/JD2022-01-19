package by.it.skorobogatyi.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskB3 {

    public static final int NUMBER = 4096;
    public static int counter;

    public static void main(String[] args) {


        ArrayList<String> peoplesInArrayList = new ArrayList<>();
        LinkedList<String> peoplesInLinkedList = new LinkedList<>();

        for (int i = 1; i < NUMBER + 1; i++) {
            peoplesInArrayList.add(Integer.toString(i));
            peoplesInLinkedList.add(Integer.toString(i));

        }

        long currentTimeArrayList = System.nanoTime();
        String restInArrayList = process(peoplesInArrayList);
        long deltaTimeArrayList = (System.nanoTime() - currentTimeArrayList) / 1000;
        System.out.println("Operation time with ArrayList = " + deltaTimeArrayList + " microseconds");

        long currentTimeLinkedList = System.nanoTime();
        String restInLinkedList = process(peoplesInLinkedList);
        long deltaTimeLinkedList = (System.nanoTime() - currentTimeLinkedList) / 1000;
        System.out.println("Operation time with LinkedList = " + deltaTimeLinkedList + " microseconds");


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
        LinkedList<String> garbage = new LinkedList<>();
        LinkedList<String> nonGarbage = new LinkedList<>();
        int innerCounter = 0;
        while (innerCounter < peoples.size() + garbage.size() + nonGarbage.size()) {
            counter++;
            if (counter % 2 == 0) {
                garbage.add(peoples.pollFirst());
            } else {
                nonGarbage.add(peoples.pollFirst());
            }
            innerCounter++;
        }
        String returnValue = nonGarbage.peek();

        if (nonGarbage.size() > 1) {
            returnValue = process(nonGarbage);
        }

        return returnValue;
    }
}
