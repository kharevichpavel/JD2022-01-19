package by.it.kharevich.jd01_04;



import java.util.Arrays;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        buildOneDimArray(string);
    }

    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);

        InOut.printArray(array, 5);
        mergeSort(array);
        InOut.printArray(array, 4);
    }
    static void mergeSort(double[ ] array) {
        Arrays.sort(array);
    }

 /*   static int binarySearch(double[ ] array){
        double firstElement = array[0];
        double lastElement = array[array.length - 1];

        Arrays.binarySearch(array,firstElement);
        Arrays.binarySearch(array,lastElement);
        System.out.printf("Index of last element=%f%n",firstElement);
        System.out.printf("Index of first element=%f%n",lastElement);
        return 0;
    }   */
}
