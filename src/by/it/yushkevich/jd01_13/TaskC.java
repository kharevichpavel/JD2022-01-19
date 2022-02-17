package by.it.yushkevich.jd01_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC {

    private static Scanner scanner;
    private static List<Double> list = new ArrayList<>();
    private static int exceptionCounter = 0;


    public static void main(String[] args)  {

        scanner = new Scanner(System.in);

        try {
            readData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    


    static void readData() throws InterruptedException {


        while (true) {

            try {
                String text = scanner.nextLine();
                double num = Double.parseDouble(text);
                list.add(num);
            } catch (NumberFormatException e) {

                Thread.sleep(100);
                exceptionCounter++;



                if (exceptionCounter == 5) {
                    throw new InterruptedException();


                    }
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.print(list.get(i) + " ");
                }
                // System.out.println();



            }


        }

    }

}

