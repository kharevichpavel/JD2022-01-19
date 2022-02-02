package by.it.chaikova.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers ");
        String string = scanner.nextLine();
        buildOneDimArray(string);

    }

        static void buildOneDimArray(String line) {
            double[] array = InOut.getArray(line);
            InOut.printArray(array, "V", 5);
            //double firstElement = array[0];
            //double lastElement = array[array.length - 1];
            mergeSort(array,0, array.length-1);
            InOut.printArray(array, "V", 4);

            //int indexFirst = Arrays.binarySearch(array,firstElement);
            //System.out.printf("Index of first element=%d%n",indexFirst);
            //int indexLast= Arrays.binarySearch(array,lastElement);
            //System.out.printf("Index of last element=%d%n",indexLast);

        }

    private static  void mergeSort(double[] array, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(array, left, delimiter - 1);
            mergeSort(array, delimiter, right);
        }
        int[] buffer = new int[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || array[cursor] > array[delimiter]) {
                buffer[i] = (int)array[cursor];
                cursor++;
            } else {
               buffer[i] =(int) array[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, array, left, buffer.length);
    }
    static int binarySearch(double[ ] array, double value){
        double min = array[0];
        double max = array[array.length - 1];
        if (max<max)
            return -1;

    }



    }
        /* for (int start = 0; start < array.length - 1; start++) {
            int least = start;
            for (int j = start + 1; j < array.length; j++) {
                if ((upDirection && array[j] < array[least]) ||
                        (!upDirection && array[j] > array[least])) {
                    least = j;
                }
            }
            int tmp = (int) array[start];
            array[start] = array[least];
            array[least] = tmp;*/
    // int delimiter = left + ((right - left) / 2) + 1;
    //if (delimiter > 0 && right > (left + 1)) {
    //  mergeSort(array, left, delimiter - 1);
    //mergeSort(array, delimiter, right);


