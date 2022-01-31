package by.it.tarend.jd01_04;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine(); // 19 56 -54 2 13 11 -8 -7

        printMulTable();
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

        int indexOfFirst = binarySearch(array, firstElement);
        int indexOfLast = binarySearch(array, lastElement);

        System.out.printf("Index of first element=%d%n", indexOfFirst);
        System.out.printf("Index of last element=%d%n", indexOfLast);
    }

    static int binarySearch(double[] array, double value) {

        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int middleIndex;

        while (leftIndex <= rightIndex) {
            middleIndex = (leftIndex + rightIndex) / 2;
            if (array[middleIndex] == value) {
                return middleIndex;
            } else if (array[middleIndex] > value) {
                rightIndex = middleIndex - 1;
            } else  {
                leftIndex = middleIndex + 1;
            }
        }
        return -1;
    }
    static void mergeSort(double[] array) {

    }
    private static double[] getPart(double[] array, int left, int right) {

        return null;
    }
    private static double[] merge(double[] part1, double[] part2) {

        return null;
    }
}
