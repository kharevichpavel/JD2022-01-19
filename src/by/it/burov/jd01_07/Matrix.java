package by.it.burov.jd01_07;

import java.util.Arrays;

public class Matrix extends Var{

    private final double[][] value;

    public Matrix(double[][] value) {
        this.value = value.clone();
    }

    public Matrix(Matrix otherMatrix){
        this.value= otherMatrix.value.clone();
    }



    public double[][] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('{');
        for (int i = 0; i < value.length; i++) {
            builder.append('{');
            String delimiter = "";
            String comma = ",";
            for (int j = 0; j < value[i].length; j++) {
                builder.append(delimiter).append(value[i][j]);
                delimiter = ", ";
            }
            if(i< value.length-1){
                builder.append('}').append(comma);
            }else {
                builder.append('}');
            }
        }
        builder.append('}');
        return builder.toString();
    }
}
