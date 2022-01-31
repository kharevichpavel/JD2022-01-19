package by.it.skorobogatyi.jd01_03;

public class Helper {

    /**
     *
     * @param array massive of doubles
     * @return minimal value in massive
     */
    static double findMin(double[] array) {

        double minElement = array[0];

        for (double arrayElement : array) {

            if (arrayElement < minElement) {
                minElement = arrayElement;
            }
        }
        return minElement;
    }

    /**
     *
     * @param array massive of doubles
     * @return maximal value in massive
     */
    static double findMax(double[] array) {

        double maxElement = array[0];

        for (double arrayElement : array) {

            if (arrayElement > maxElement) {
                maxElement = arrayElement;
            }
        }
        return maxElement;
    }
    /**
     *
     * @param array massive of doubles, sorted or unsorted, sorts massive with bubblesort
     */
    static void sort(double[] array) {
        int counter = 0;
        boolean isNotSorted;
        do {
            isNotSorted = false;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < (array.length - counter - 1); j++) {

                    if (array[j] > array[j + 1]) {

                        isNotSorted = true;
                        double temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                counter++;
            }
        } while (isNotSorted);
    }

    /**
     *
     * @param matrix matrix of doubles
     * @param vector massive of doubles
     * @return  array of doubles - result of multiplying matrix on vector
     */
    static double[] multiply(double[][] matrix, double[] vector) {

        double[] returnMatrix = new double[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                returnMatrix[i] = returnMatrix[i] + matrix[i][j] * vector[j];
            }
        }

        return returnMatrix;
    }

    /**
     *
     * @param matrixLeft matrix of doubles, should have number of lines equal to number of columns in second matrix
     * @param matrixRight matrix of doubles, should have number of columns equal to number of lines in first matrix
     * @return matrix of doubles
     */
    static double[][] multiply(double[][] matrixLeft, double[][] matrixRight) {

        double[][] returnMatrix = new double[matrixLeft.length][matrixRight[0].length];

        for (int i = 0; i < returnMatrix.length; i++) {
            for (int j = 0; j < returnMatrix[0].length; j++) {
                for (int k = 0; k < matrixLeft[0].length; k++) {
                    returnMatrix[i][j] = returnMatrix[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return returnMatrix;
    }
}
