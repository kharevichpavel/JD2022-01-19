package by.it.tarend.jd01_13;

import java.util.*;

public class TaskC {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        try {
            readData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void readData() throws InterruptedException {
        LinkedList<Double> numbers = new LinkedList<>();
        int errorCounter = 0;
        while (errorCounter < 6) {
            String line = scanner.nextLine();
            try {
                double number = Double.parseDouble(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                Thread.sleep(100);
                Iterator<Double> reverseIterator = numbers.descendingIterator();
                while (reverseIterator.hasNext()) {
                    System.out.print(reverseIterator.next() + " ");
                }
                errorCounter++;
                if (errorCounter == 5) {
                    throw new NumberFormatException();
                }
            }
        }
    }
}

