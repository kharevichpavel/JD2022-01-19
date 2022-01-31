package by.it.kharevich.jd01_03;

class Helper {

    static double findMin(double[] array) {
        if (0== array.length){
            return Integer.MIN_VALUE;
        }
        else {
            double min=array[0];
            for (double element:array) {
                if (min>element) {min=element;}
                System.out.print(min+"  ");
            }
            return min;
        }
    }

    static double findMax(double[] array) {
        if (0== array.length){
            return Integer.MAX_VALUE;
        }
        else {
            double max=array[0];
            for (double element:array) {
                if (max<element) {max=element;}
                System.out.print(max+"  ");
            }
            return max;
        }
    }

    static void sort(double[] array) {
        boolean swap;
        double lastElement= array.length-1;
        do {
            swap = false;
            for (int i = 0; i < lastElement; i++) {
                if (array[i]>array[i+1]){
                    double bufferElement = array[i];
                    array[i]=array[i+1];
                    array[i+1]=bufferElement;
                    swap = true;
                }
            }
            lastElement--;
        }
        while (swap);

    }



    static double[] multiply(double[][] matrix, double[] vector) {
        double[] matVec = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < vector.length; j++)
                matVec [i] = matVec [i] + matrix[i][j]*vector[j];

        return matVec;

    }


    static double[][] multiply(double[][] matrixLeft, double[][] matrixRight) {
        double [][] multiMatrix = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    multiMatrix[i][j] = multiMatrix[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                }
            }
        }
        return multiMatrix;
    }

}
