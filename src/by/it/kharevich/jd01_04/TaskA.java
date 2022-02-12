package by.it.kharevich.jd01_04;

import java.util.Scanner;

public class TaskA {
    private static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ",i,j,i * j);
            }
            System.out.println();
        }
    }

    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double firstElement = array[0];
        double lastElement = array[array.length - 1];
        InOut.printArray(array, 5);
        Helper.sort(array);
        InOut.printArray(array, 4);

        for (int i = 0; i < array.length; i++) {
            if (firstElement == array[i]) {
                System.out.printf("Index of first element=%d%n",i);
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (lastElement == array[i]) {
                System.out.printf("Index of last element=%d%n",i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        printMulTable();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        buildOneDimArray(string);
    }
}
