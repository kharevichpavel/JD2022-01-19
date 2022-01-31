package by.it._classwork_.jd01_03;

import java.util.Arrays;

public class Helper {

    public static void main(String[] args) {
        double[] array = {10, 2, 5, 8, 9, 6, 4, 3, 2, 0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(double[] array) {
        // 0  1  2  3  4  5  6  7  8  9
        //10, 2, 5, 8, 9, 6, 4, 3, 2, 0
        //2  5   8  9  6  4  3  2  0 10
        int lastIndex = array.length - 1;
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }
            lastIndex--;
        } while (swap);
    }
}
