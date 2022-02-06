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
        static double[] multiply(double[][] matrix, double[] vector){
        double[] array = new double [matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < vector.length; j++) {
                    array[i] += matrix[i][j] * vector[j];
                }
            }
            return array;
        }
    static double[][] multiply(double[][] matrixLeft, double[][] matrixRight){
        double matrix[][] = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    matrix[i][j] += matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return matrix;
    }

    }

