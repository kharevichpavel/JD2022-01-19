package by.it.kharevich.jd01_12;

import java.util.*;

public class TaskB2 {

    public static void main(String[] args) {

        ArrayList<String> peoplesA = new ArrayList<>();
        LinkedList<String> peoplesL = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int peopleCount = scanner.nextInt();

        for (int i = 0; i < peopleCount; i++) {
            peoplesA.add(Integer.toString(i));
            peoplesL.add(Integer.toString(i));
        }

        process(peoplesA);
        process(peoplesL);

        String resultA = process(peoplesA);
        System.out.println("Last Standing Hero (ArrayList) #" + resultA);
        String resultB = process(peoplesL);
        System.out.println("Last Standing Hero (LinkedList) #" + resultB);
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
}
