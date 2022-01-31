package by.it.kravchenko.jd01_03;

    class Helper {
        static double findMin(double[] array) {
            double min = array[0];
            for (double element : array) {
                if (element < min) min = element;
            }
            System.out.println(min);

            return min;
        }

        static double findMax(double[] array) {
            double max = array[0];
            for (double element : array) {
                if (element > max) max = element;
            }
            System.out.println(max);

             return max;
        }
        static void sort(double[ ] array){
            boolean swap;
            int last = array.length - 1;
            do {
                swap = false;
                for (int index = 0; index < last; index++) {
                    if (array[index] > array[index+1]){
                        double charter = array[index] ;
                        array[index] = array[index+1];
                        array[index+1] = charter;
                        swap = true;
                    }
                }
                last--;
           }
            while (swap);


        }

    }