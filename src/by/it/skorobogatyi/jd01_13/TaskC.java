package by.it.skorobogatyi.jd01_13;

import java.util.ArrayDeque;
import java.util.Scanner;

public class TaskC {

    private static Scanner scanner;
    private static int errorCounter;
    private static final ArrayDeque<Double> deque = new ArrayDeque<>();


    public static void main(String[] args) throws InterruptedException {

        scanner = new Scanner(System.in);
        try {
            while (scanner.hasNext()) {
                readData();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static void readData() throws InterruptedException {

        try {
            double parseDouble = Double.parseDouble(scanner.next());
            deque.addFirst(parseDouble);

        } catch (NumberFormatException e) {
            errorCounter++;
            Thread.sleep(100);

            if (errorCounter >= 5) {
                throw new InterruptedException();
            }
            printDeque();
        }

    }

    private static void printDeque() {

        for (Double next : deque) {
            System.out.print(next + " ");
        }
        System.out.println();
    }


}
