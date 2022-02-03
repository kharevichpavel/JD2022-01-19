package by.it.chaikova.jd01_04;

import java.util.Arrays;

class Helper {
    static void sort(double[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    static double findMin(double[] array) {
        if (0 == array.length) {
            return Integer.MIN_VALUE;
        } else {
            double min = array[0];
            for (double m : array) {
                if (min > m) {
                    min = m;
                }
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
                if (max < m) {
                    max = m;
                }
            }
            return max;
        }
    }

    static double[] multiply(double[][] matrix, double[] vector) {
        double[] result = new double[matrix.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        return result;
    }
    static double[][] multiply(double[][] matrixLeft, double[][] matrixRight) {
        double[][] result = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++)
                result[i] [j]+= matrixLeft[i][k] * matrixRight[k][j];
            }
        }
        return result;
    }
}





