package by.it.tarend.jd01_07;

import java.util.Arrays;

public class Matrix extends Var{

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
        String[] strArray = strMatrix.replaceAll("[{,]+|[}]{2,}", "").trim().split("}");
        for (int i = 0; i < strArray.length; i++) {



        }
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
