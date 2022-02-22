package by.it.tarend.jd01_12;

import java.util.*;

public class TaskB2 {

    static int counter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arrayPeoples = new ArrayList<>();
        LinkedList<String> linkedPeoples = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arrayPeoples.add(Integer.toString(i+1));
            linkedPeoples.add(Integer.toString(i+1));
        }
        System.out.println(arrayPeoples);
        System.out.println(linkedPeoples);
        System.out.println(process(arrayPeoples));
        System.out.println(process(linkedPeoples));
    }

    private static String process(ArrayList<String> peoples) {
        Iterator<String> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
            if (counter % 2 == 0) {
                iterator.remove();
                counter = 0;
            }
        }
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
                counter = 0;
            }
        }
        if (peoples.size() > 1) {
            process(peoples);
        }
        counter = 0;
        return peoples.get(0);
    }
}
