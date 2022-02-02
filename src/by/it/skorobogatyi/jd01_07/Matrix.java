package by.it.skorobogatyi.jd01_07;

public class Matrix extends Var {

    private final double[][] value;


    public Matrix(double[][] value) {
        this.value = value.clone();
    }

    public Matrix(Matrix otherMatrix) {
        this.value = otherMatrix.value.clone();
    }

    public Matrix(String stringWithMatrix) {

        String[] matrixElements = stringWithMatrix.split("[^0-9],\s?[^0-9]");

        value = new double[matrixElements.length][];

        for (int i = 0; i < matrixElements.length; i++) {

            matrixElements[i] = matrixElements[i].replaceAll("[{},\\s]+", " ").trim();
            String[] lineElements = matrixElements[i].split(" ");

            for (int j = 0; j < lineElements.length; j++) {
                value[i][j] = Double.parseDouble(lineElements[j]);
            }
        }
    }



    public double[][] getValue() {
        return this.value;
    }
}
