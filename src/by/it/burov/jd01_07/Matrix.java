package by.it.burov.jd01_07;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var{

    private final double[][] value;

    public Matrix(double[][] value) {
        this.value = value.clone();
    }

    public Matrix(Matrix otherMatrix){
        this.value= otherMatrix.value.clone();
    }

    public Matrix(String stringValue) {
        int columns = 0;
       // String[][] stringArray1 = {{}};
        Pattern patternColumns = Pattern.compile("[\\{]+");
        Matcher matcher1 = patternColumns.matcher(stringValue);
        while (matcher1.find()) {
            columns++;
        }
        Pattern patternLines = Pattern.compile("[\\d.?\\d]+");
        Matcher matcher2 = patternLines.matcher(stringValue);
        String[] stringArray = {};

        while (matcher2.find()) {
            String digit = matcher2.group();
            stringArray = Arrays.copyOf(stringArray, stringArray.length + 1);
            stringArray[stringArray.length - 1] = digit;
        }
        int linesLength = stringArray.length / columns;
        double[][] doubleMatrix = new double[columns][linesLength];
        for (int i = 0, digitPosition = 0; i < doubleMatrix.length; i++) {
            for (int j = 0; j < linesLength; j++) {
                doubleMatrix[i][j] = Double.parseDouble(stringArray[digitPosition]);
                digitPosition++;
            }
        }
        this.value = doubleMatrix;
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
