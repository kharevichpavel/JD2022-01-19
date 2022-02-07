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


    public Matrix(String textMatrix) {

        String regex = "[{]\\s[0-9.,\\s]+[}]";
        String regexNum = "[0-9.]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textMatrix);
        while (matcher.find()) {
            String text = matcher.group();
            text = text.replaceAll("[{]", "");
            text = text.replaceAll("[}]", "");
            text.trim();


        }


    }


    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();
        out.append("{");
        //System.out.println(value.length);
        //System.out.println(value[0].length);

        for (int i = 0; i < value.length; i++) {
            out.append("{");
            for (int j = 0; j < value[i].length; j++) {

                out.append(value[i][j]);

                if (j < value[i].length - 1) {
                    out.append(",");

                }

                //out.append("?}");


            }

            out.append("}");
            if (i<value.length-1){
                out.append(",");
            }
        }
        out.append("}");

        return out.toString();
    }
}
