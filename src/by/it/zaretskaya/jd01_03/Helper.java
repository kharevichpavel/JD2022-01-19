package by.it.zaretskaya.jd01_03;

import com.sun.jdi.Value;

public class Helper {
    public static void main(String[] args) {
        double[] array = {11, 22, 33, 66, 99, 0, 123, -9};
        sort(array);

    }

    static void sort(double[] array) {
        int lastIndex = array.length - 1;
        boolean sortNotComplete;
        do {
            sortNotComplete = false;

            for (int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sortNotComplete = true;

                }

            }
            lastIndex--;
        } while (sortNotComplete);


    }

    static double findMin(double[] array) {
        if (0 == array.length) {
            return Integer.MIN_VALUE;
        } else {
            double min = array[0];
            for (double i : array) {
                if (min > i) min = i;
            }
            return (min);
        }
    }

    static double findMax(double[] array) {
        if (0 == array.length) {
            return Integer.MAX_VALUE;
        } else {
            double max = array[0];
            for (double i : array) {
                if (max < i) max = i;
            }
            return (max);

        }
    }
}
