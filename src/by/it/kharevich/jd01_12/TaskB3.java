package by.it.kharevich.jd01_12;

import java.util.*;

public class TaskB3 {

    public static void main(String[] args) {

        ArrayList<String> peoplesA = new ArrayList<>();
        LinkedList<String> peoplesL = new LinkedList<>();
        LinkedList<String> peoplesLinked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int peopleCount = scanner.nextInt();   // 4096 peoples


        for (int i = 0; i < peopleCount; i++) {
            peoplesA.add(Integer.toString(i));
            peoplesL.add(Integer.toString(i));
            peoplesLinked.add(Integer.toString(i));
        }

        long startArrayTime = System.nanoTime();
        process(peoplesA);
        long stopArrayTime = System.nanoTime();
        double resultArrayTime = (stopArrayTime - startArrayTime) * 0.000000001;
        System.out.println("ArrayList running time -----------------------------" + resultArrayTime + " sec");

        long startLinkedTime = System.nanoTime();
        process(peoplesL);
        long stopLinkedTime = System.nanoTime();
        double resultLinkedTime = (stopLinkedTime - startLinkedTime) * 0.000000001;
        System.out.println("LinkedList running time ----------------------------" + resultLinkedTime + " sec");

        long startLinked = System.nanoTime();
        processLinked(peoplesLinked);
        long stopLinked = System.nanoTime();
        double resultLinked = (stopLinked - startLinked) * 0.000000001;
        System.out.println("LinkedList without iterator running time -----------" + resultLinked + " sec");

        String resultA = process(peoplesA);
        System.out.println("Last Standing Hero (ArrayList) ---------------------# " + resultA);
        String resultL = process(peoplesL);
        System.out.println("Last Standing Hero (LinkedList) --------------------# " + resultL);
        String resultWithout = processLinked(peoplesLinked);
        System.out.println("Last Standing Hero (LinkedList without iterator) ---# " + resultWithout);

    }

    static String process(ArrayList<String> peoples) {
        int counter = 0;
        Iterator<String> peoplesIterator = peoples.iterator();
        while (peoples.size() != 1) {
            if (peoplesIterator.hasNext()) {
                peoplesIterator.next();
                counter++;
                if (counter == 2) {
                    peoplesIterator.remove();
                    counter = 0;
                }
            } else {
                peoplesIterator = peoples.iterator();
            }
        }
        return peoples.get(0);
    }

    static String process(LinkedList<String> peoples) {
        int counter = 0;
        Iterator<String> peoplesIterator = peoples.iterator();
        while (peoples.size() != 1) {
            if (peoplesIterator.hasNext()) {
                peoplesIterator.next();
                counter++;
                if (counter == 2) {
                    peoplesIterator.remove();
                    counter = 0;
                }
            } else {
                peoplesIterator = peoples.iterator();
            }
        }
        return peoples.get(0);
    }

    static String processLinked(LinkedList<String> peoples) {
        int counter = 0;
        for (int i = 0; i < peoples.size(); i++) {
            while (peoples.size() != 1) {
                counter++;
                if (counter == 2) {
                    peoples.remove();
                    counter = 0;
                }
            }
        }
        return peoples.get(0);
    }
}
