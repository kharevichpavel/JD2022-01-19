package by.it.kuzma.jd01_03;

public class Helper {
    static double findMin(double[] array) {
       double minNumb = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<minNumb){
                minNumb = array[i];
            }
        }
        System.out.println(minNumb);
        return minNumb;
    }

    static double findMax(double[] array) {
        double maxNumb = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxNumb){
                maxNumb = array[i];
            }
        }
        System.out.println(maxNumb);
        return maxNumb;

    }

    static void sort(double[] array) {
        boolean swap = true;
        int last = array.length - 1;
        while (swap) {
            swap = false;
            for (int i = 0; i < last; i++) {
                if (array[i] > array[i + 1]) {
                    double buffer = array[i+1];
                    array[i+1] = array[i];
                    array[i] = buffer;
                    swap = true;
                }
            }
            last--;
        }
        String name = "V";
        int columnCount = 4;
        InOut.printArray(array, name, columnCount);
            
        }
    }

