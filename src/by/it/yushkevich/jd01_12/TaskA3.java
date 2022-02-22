package by.it.yushkevich.jd01_12;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int positionZero = 0;

        for (; ; ) { // === while(true)
            String word = scanner.next();

            if (!word.equals("end")) {

                int value = Integer.parseInt(word);

                if (value == 0) {
                    // нули начинаем вставлять в начало списка
                    integers.add(positionZero, value);
                   // System.out.println(positionZero);
                } else if (value > 0) {

                    integers.add(positionZero, value);
                    System.out.println("BEFORE ++ _____"+positionZero);
                    positionZero++; // т.к. нам нужно соблюдать порядок, слудующее число >0 должео стать на след ячейку.
                    System.out.println("AFTER ++ ______"+positionZero);
                } else {
                    //отрицательные в конец списка по очереди как и надо
                    integers.add(value);
                }


            } else {
                break;

            }

        }
        System.out.println(integers);
        System.out.println(positionZero);


    }

}
