package by.it.tarend.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine(); // 19 56 -54 2 13 11 -8 -7

        buildOneDimArray(line);
    }
    static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ", i, j, i*j);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void buildOneDimArray (String line) {
        double[] array = InOut.getArray(line);
        double firstElement = array[0];
        double lastElement = array[array.length-1];

        InOut.printArray(array, "V", 5);
        System.out.println();
        Helper.sort(array);
        InOut.printArray(array, "V", 4);
        System.out.println();

        int indexOfFirst = Arrays.binarySearch(array, firstElement);
        int indexOfLast = Arrays.binarySearch(array, lastElement);

        System.out.printf("Index of first element=%d/n", indexOfFirst);
        System.out.printf("Index of last element=%d/n", indexOfLast);
    }
}
