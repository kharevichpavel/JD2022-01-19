package by.it.kharevich.jd01_03;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter any array of numbers, space after each number");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        double[] array = InOut.getArray(line);
        System.out.println("\nSimple output");
        InOut.printArray(array);

        String name = "lineName";
        int columnCount = 4;
        System.out.println("\nOutput with columns number");
        InOut.printArray(array, name, columnCount);


        System.out.println("\nMinimum value");
        Helper.sort(array);
        Helper.findMin(array);

        System.out.println("\nMaximum value");
        Helper.sort(array);
        Helper.findMax(array);

        System.out.println("\nOutput with columns number after sorting");
        Helper.sort(array);
        InOut.printArray(array, name, columnCount);

        System.out.println("\nEnter dimension of matrix and vector, one number");
        int size = sc.nextInt();
        double[][] matrix = new double[size][size];
        double[] vector = new double[size];
        Helper.multiply(matrix, vector);

        System.out.println("\nEnter dimension of two matrices, one number");
        int sizeM = sc.nextInt();
        double[][] matrixLeft = new double[sizeM][sizeM];
        double[][] matrixRight = new double[sizeM][sizeM];
        Helper.multiply(matrixLeft, matrixRight);


    }

}
