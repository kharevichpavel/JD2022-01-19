package by.it.burov.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        InOut.getArray(line);
        double[] array = InOut.getArray(line);
        System.out.println("\n Simple output");
        InOut.printArray(array);
        String name = "V";
        int columnCount = 5;
        System.out.println("\n Output with column numbers");
        InOut.printArray(array,name,columnCount);
        System.out.println("\n Output minimum value");
        Helper.findMin(array);
        System.out.println(Helper.findMin(array));
        System.out.println("\n Output maximum value");
        Helper.findMax(array);
        System.out.println(Helper.findMax(array));
        Helper.sort(array);
        System.out.println("\n Output with sorted numbers");
        InOut.printArray(array);
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        double[] vector = {4, 5, 6};
        Helper. multiply(matrix, vector);
        Helper.multiply(matrix, matrix);

    }
}
