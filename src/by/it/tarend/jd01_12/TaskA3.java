package by.it.tarend.jd01_12;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int positionOfZero = 0;
        while (true) {
            String nextWord = sc.next();
            if (!nextWord.equals("end")) {
                int value = Integer.parseInt(nextWord);
                if (value == 0) {
                    integers.add(positionOfZero, value);
                } else if (value > 0) {
                    integers.add(positionOfZero++, value);
                } else {
                    integers.add(value);
                }
            } else {
                break;
            }
        }
        System.out.println(integers);
    }
}
