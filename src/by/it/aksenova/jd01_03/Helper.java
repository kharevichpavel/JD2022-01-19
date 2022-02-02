package by.it.aksenova.jd01_03;

public class Helper {
    static double findMin(double[] array) {
        if (0 == array.length) {
            return Integer.MIN_VALUE;
        } else {
            double min = array[0];
            for (double a : array) {
                if (min > a) {
                    min = a;
                }
            }
            return min;
        }

    }

    static double findMax(double[] array) {
        if (0 == array.length) {
            return Integer.MIN_VALUE;
        } else {
            double max = array[0];
            for (double v : array) {
                if (max < v) {
                    max = v;
                }
            }
            return max;
        }
    }

    public static void sort(double[] array) {
        boolean swap;
        int last= array.length-1;
        do{
            swap=false;
            for (int i = 0; i < last; i++) {
                if(array[i]>array[i+1]) {
                    double buffer=array[i];
                    array[i]=array[i+1];
                    array[i+1]=buffer;
                    swap=true;
                }
            }
            last--;

        }
        while (swap);

    }
}
