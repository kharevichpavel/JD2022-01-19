package by.it.tarend.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // TaskA
        // 0.11 11.00 12.123 -34.2 -1 0 -123.456 56
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int columnCount = 3;
        String nameOfArray = "v";
        double[] array = InOut.getArray(line);
        System.out.println("\n Simple output \n");
        InOut.printArray(array);
        System.out.println("\n Formatted output with columns \n");
        InOut.printArray(array, nameOfArray, columnCount);
        System.out.println();

        // TaskB
        double minElement = Helper.findMin(array);
        double maxElement = Helper.findMax(array);
        System.out.println("MAX: " + maxElement + "\nMIN: " + minElement);
        Helper.sort(array);
        InOut.printArray(array);

        //TaskC
        double[][] matrix = {{1, 2, 3},
                             {4, 5, 6}};
        double[] vector = {1, 2, 3};
        double[][] matrixLeft = {{1, 2, 3},
                                 {4, 5, 6}};
        double[][] matrixRight = {{1, 2},
                                {3, 4},
                                {5, 6}};

        double[] resultVector = Helper.multiply(matrix, vector);
        double[][] resultMatrix = Helper.multiply(matrixLeft, matrixRight);
    }
}
