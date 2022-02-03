package by.it.yushkevich.jd01_03;

public class Helper {


    public static double findMax(double[] array) {

        double max = 0;
        for (double element : array) {
            if (element>max){
                max = element;
            }
        }

        return max;
    }

    public static double findMin(double[] array) {
        double min = 0;
        for (double element : array) {
            if (element<min){
                min = element;
            }
        }

        return min;

    }

    public static void sort(double[] array) {

        boolean swap;// default -- false ---это флажок переключатель, когда отсортируется, тогда выйдет из цикла.
        int last = array.length-1;
        do {
            swap = false; // ставим флажок на фолс, ечли следующий цикл не выполнится.то в нем не поменяется флажок на тру и соответственно выйдем из цикла ду вайл
            for (int i = 0; i < array.length-1; i++) { // т.к. буем сравнивать i и следующий элемент, поэтому ленгз-1 , иначе выйдем за рамки массива
               if (array[i]>array[i+1]){
                   double bufferNumber = array[i];
                   array[i] = array[i+1];
                   array[i+1] = bufferNumber;
                   swap = true;
               }
               //last--; // чтоб не проверять то, что уже отсортировано, т.к. самый большой элемент уже в конце

            }
        } while (swap);

    }


    static double[] multiply(double[][] matrix, double[] vector){

       double[] newOne = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                newOne[i] = newOne[i] + matrix[i][j]*vector[j]; //разобраться зачем нюван
            }
        }


        return newOne;
    }



    static double[] multiply(double[][] matrixLeft, double[][] matrixRight){

        double[][] newMassive = new double[matrixLeft.length][matrixRight[0].length];


        return null;
    }



}
