package by.it.skorobogatyi.jd01_03;

public class Runner {

    public static void main(String[] args) {

        String line = " 11 22 33 66 99 0 123 -9";
        double[] array = InOut.getArray(line);

        System.out.println("Simple output: ");
        InOut.printArray(array);
        System.out.println();

        String arrayName = "v";
        int columnsNumber = 5;

        System.out.println("Complex output: ");
        InOut.printArray(array, arrayName, columnsNumber);

        Helper.sort(array);

        System.out.println("Simple output of sorted array");
        InOut.printArray(array);

        double[][] matrixLeft = {{1, 2, 3}, {4, 5, 6}};
        double[][] matrixRight = {{1, 2}, {3, 4}, {5, 6}};
        Helper.multiply(matrixLeft, matrixRight);
    }
}
