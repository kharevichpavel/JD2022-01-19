package by.it.yushkevich.jd01_07;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var {

    private double[][] value;


    public Matrix(double[][] value) {
        this.value = value.clone();
    }


    public Matrix(Matrix otherMatrix) {

        this.value = otherMatrix.value.clone();// надо подумать как клонировать двумерный массив. возможно циклом?
    }


//    public Matrix(String textMatrix) {
    //есть строка, нужно понять, какого размера нам делать двумерный массив. Сколько столбцов / сколько строк?
    // можно попробовать регексом сразу определить количество строк, например {+цифра --сколько совпадет, столько строк
    // столбцы похожим образом разделить...
//        //String[] rowsCounter = textMatrix.split();
//
//        String rowCount = "[{]\s?[0-9]";
//        String colCount = "";

    public Matrix(String strMatrix) {


        String regexRowCount ="[{]\s?[0-9]";
        Pattern patternRow = Pattern.compile(regexRowCount);
        Matcher matcherRowCount = patternRow.matcher(strMatrix);
        int rowCounter = 0;
        while (matcherRowCount.find()){
            rowCounter++;
        }
        System.out.println(rowCounter);

        String regexColCount = "";


    }



    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();
        out.append("{");


        for (int i = 0; i < value.length; i++) {
            out.append("{");
            for (int j = 0; j < value[i].length; j++) {

                out.append(value[i][j]);

                if (j < value[i].length - 1) {
                    out.append(",");

                }
            }

            out.append("}");
            if (i < value.length - 1) {
                out.append(",");
            }
        }
        out.append("}");

        return out.toString();
    }
}
