package by.it.yushkevich.jd01_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC {

    private static Scanner scanner;

    public static void main(String[] args) throws InterruptedException {

        scanner = new Scanner(System.in);

        readData();


    }

    static void readData() throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        int exceptionCounter = 0;

        while (true) {
            if (exceptionCounter == 5) {
                throw new Error();
            }
            try {
                String text = scanner.nextLine();
                int num = Integer.parseInt(text);
                list.add(num);
            } catch (NumberFormatException e) {

                Thread.sleep(100);

                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.print(list.get(i) + " ");

                }
                System.out.println();

                exceptionCounter++;

            }


        }

    }

}

