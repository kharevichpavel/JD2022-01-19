package by.it.chaikova.jd01_03;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the numbers ");
        String line =scanner.nextLine();

        double[] array = InOut.getArray(line);
        System.out.println("\nSimple output");
        InOut.printArray (array);
        String name = "V";
        int columnCount = 5;
        System.out.println("\nOutput with columns number");
        InOut.printArray(array, name, columnCount);

        Helper.sort(array);
        System.out.println("\nOutput with columns number after sorting");
        InOut.printArray(array, name, columnCount);

        Helper.findMin(array);
        System.out.println("\nMinimum value:");
        System.out.println(array[0]);

        Helper.findMax(array);
        System.out.println("\nMaximum value:");
        System.out.println(array[0]);



    }
}
