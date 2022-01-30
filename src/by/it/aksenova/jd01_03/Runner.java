package by.it.aksenova.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();
        double[] array = InOut.getArray(line);
        System.out.println("\nSimple output");
        InOut.printArray(array);
        String name = "V";
        int columnCount = 5;
        System.out.println("\nOutput with columns number");
        InOut.printArray(array, name, columnCount);
        Helper.sort(array);
        System.out.println("\nOutput with columns number after sorting");
        InOut.printArray(array, name, 3);


    }
}