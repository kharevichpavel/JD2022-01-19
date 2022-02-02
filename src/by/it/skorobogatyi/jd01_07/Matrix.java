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

        value = new double[matrixElements.length][0];

        for (int i = 0; i < matrixElements.length; i++) {

            matrixElements[i] = matrixElements[i].replaceAll("[{},\\s]+", " ").trim();
            String[] lineElements = matrixElements[i].split(" ");

            double[] lineElementsInDouble = new double[lineElements.length];

            for (int j = 0; j < lineElements.length; j++) {
                lineElementsInDouble[j] = Double.parseDouble(lineElements[j]);
            }

            value[i] = lineElementsInDouble;
        }
    }


    public double[][] getValue() {
        return this.value;
    }

    @Override
    public String toString() {

        StringBuilder returnString = new StringBuilder();

        returnString.append("{");

        for (int i = 0; i < value.length; i++) {
            returnString.append("{");

            for (int j = 0; j < value[i].length - 1; j++) {
                double element = value[i][j];
                returnString.append(element).append(", ");
            }

            returnString.append(value[i][value[i].length - 1]).append("}");

            if (i < value.length - 1) {
                returnString.append(", ");
            }
        }
        returnString.append("}");

        return String.valueOf(returnString);
    }
}
