package by.it.tarend.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskB3 {

    static int counter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4096;
        ArrayList<String> arrayPeoples = new ArrayList<>();
        LinkedList<String> linkedPeoples = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arrayPeoples.add(Integer.toString(i+1));
            linkedPeoples.add(Integer.toString(i+1));
        }

        long t0 = System.nanoTime();
        process(arrayPeoples);
        long t1 = System.nanoTime() - t0;
        t0 = System.nanoTime();
        process(linkedPeoples);
        long t2 = System.nanoTime() - t0;

        System.out.println(t1);
        System.out.println(t2);

    }

    private static String process(ArrayList<String> peoples) {
        Iterator<String> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
            if (counter % 2 == 0) {
                iterator.remove();
            }
        }
        if (counter % 2 != 0) {
            counter = 1;
        } else
            counter = 0;
        if (peoples.size() > 1) {
            process(peoples);
        }
        counter = 0;
        return peoples.get(0);
    }

    private static String process(LinkedList<String> peoples) {
        Iterator<String> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
            if (counter % 2 == 0) {
                iterator.remove();
            }
        }
/*        if (counter % 2 != 0) {
            counter = 1;
        } else
            counter = 0;*/
        if (peoples.size() > 1) {
            process(peoples);
        }
        counter = 0;
        return peoples.get(0);
    }
}
