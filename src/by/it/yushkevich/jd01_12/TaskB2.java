package by.it.yushkevich.jd01_12;

import java.util.*;

public class TaskB2 {


    private static final int COUNT = 25;
    private static int counter;

    public static void main(String[] args) {


        ArrayList<String> peoplesArrayList = new ArrayList<>();
        LinkedList<String> peoplesLinkedList = new LinkedList<>();
//filling arrays
        for (int i = 1; i <= COUNT; i++) {
            peoplesArrayList.add("[Num " + i + "]");
            peoplesLinkedList.add("[Num " + i + "]");
        }


// start counting
        // process(peoplesArrayList);
        process(peoplesLinkedList);


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
        //counter = 0;


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
        //counter = 0;


        return peoples.get(0);
    }
}
