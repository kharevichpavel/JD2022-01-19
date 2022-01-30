package by.it.skorobogatyi.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {

        printMulTable();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        buildOneDimArray(string);
    }


    static void printMulTable() {

        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                int result = i * j;
                System.out.printf("%d*%d=%-3d", i, j, result);
            }
            System.out.println();
        }
    }

    static void buildOneDimArray(String line) {

        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);

        double firstElement = array[0];
        double lastElement = array[array.length - 1];

        Helper.sort(array);

        InOut.printArray(array, "V", 4);

        int indexFirst = Arrays.binarySearch(array, firstElement);
        int indexLast = Arrays.binarySearch(array, lastElement);

        System.out.printf("Index of first element=%d%n", indexFirst);
        System.out.printf("Index of last element=%d%n", indexLast);
    }
}
