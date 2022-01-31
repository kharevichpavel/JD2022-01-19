package by.it.burov.jd01_03;

public class Helper {
    static double findMin(double[] array) {
        double minimum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    static double findMax(double[] array) {
        double maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    static void sort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                double currentValue = array[i];
                if (currentValue > array[j]) {
                    double nextValue = array[j];
                    array[i] = nextValue;
                    array[j] = currentValue;
                }
            }
        }
    }

    static double[] multiply(double[][] matrix, double[] vector) {
        double[] array = new double[matrix.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                array[i] = array[i] + matrix[i][j] * vector[j];
            }
        }
        return array;
    }

    static double[ ][ ] multiply(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
        double[][] array = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++)
                array[i][j] = array[i][j] + matrixLeft[i][k] * matrixRight[k][j];
            }
        }
        return array;
    }
}
