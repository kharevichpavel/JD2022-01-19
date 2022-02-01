package by.it.katsal.jd01_03;

class Helper {

    static double findMin(double[] array) {
        if (0 == array.length) {
            return Integer.MIN_VALUE;
        } else {
            double min = array[0];
            for (double m : array) {
                if (min > m) min = m;

            }

            return min;
        }
    }

    static double findMax(double[] array) {
        if (0 == array.length) {
            return Integer.MAX_VALUE;
        } else {
            double max = array[0];
            for (double m : array) {
                if (max < m) max = m;

            }
            return max;
        }

    }
     static void sort(double[ ] array){

        boolean swap;
        int last = array.length-1;
        do{
            swap = false;
            for (int j = 0; j < last  ; j++){
                if (array[j] > array[j + 1]) {
                    int buffer = (int) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    swap = true;
                }

            }
            last--;
        }
        while (swap );
    }
}
