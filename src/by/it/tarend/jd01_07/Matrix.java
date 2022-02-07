package by.it.tarend.jd01_07;

import java.util.Arrays;

class Matrix extends Var{

    private double[][] value;

    public Matrix(double[][] value) {

        this.value = value.clone();
        for (int i = 0; i < value.length; i++) {
            this.value[i] = value[i].clone();
        }
    }

    public Matrix(Matrix otherMatrix) {
        this.value = otherMatrix.value.clone();
        for (int i = 0; i < value.length; i++) {
            this.value[i] = otherMatrix.value[i].clone();
        }
    }

    public Matrix(String strMatrix) {

        String[] rows = strMatrix.replaceAll("[{]+|[}]{2,}", " ").trim().split("},");
        int rowsCounter = rows.length;
        int columnsCounter = rows[0].trim().split("[,]").length;

        String[][] elements = new String[rowsCounter][columnsCounter];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = rows[i].trim().split("[,]");
        }
        double[][] value = new double[rowsCounter][columnsCounter];
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                value[i][j] = Double.parseDouble(elements[i][j]);
            }
        }
        this.value = value;

    }




    @Override
    public String toString() {
        StringBuilder outPut = new StringBuilder();
        outPut.append("{");
        for (int i = 0; i < value.length; i++) {
            String delimiter = "";
            outPut.append("{");
            for (int j = 0; j < value[i].length; j++) {
                outPut.append(delimiter).append(value[i][j]);
                delimiter = ", ";
            }
            if (i == value.length - 1) {
                delimiter = "";
            }
            outPut.append("}").append(delimiter);
        }
        outPut.append("}");
        return outPut.toString();
    }
}
