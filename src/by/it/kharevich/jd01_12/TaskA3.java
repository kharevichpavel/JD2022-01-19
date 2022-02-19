package by.it.kharevich.jd01_12;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int positionZero = 0;

        for (; ; ) {
            String word = scanner.next();
            if (!word.equals("end")) {
                int enter = Integer.parseInt(word);
                if (enter == 0) {
                    integers.add(positionZero, enter);
                } else if (enter > 0) {
                    integers.add(positionZero++, enter);
                } else {
                    integers.add(enter);
                }
            } else {
                break;
            }
        }
        System.out.println(integers);
    }
}
