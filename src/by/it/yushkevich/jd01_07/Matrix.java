package by.it.yushkevich.jd01_07;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var{

    private double[][] value;


    public Matrix(String textMatrix){

        String regex = "[{]\\s[0-9.,\\s]+[}]";
        String regexNum = "[0-9.]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textMatrix);
        while (matcher.find()){
            String text = matcher.group();
            text = text.replaceAll("[{]","");
            text = text.replaceAll("[}]","");
            text.trim();



        }


    }

    public Matrix(Matrix matrix){
        this.value = matrix.value;
    }


    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();
        out.append("{ ");

        for (int i = 0; i < value.length; i++) {
            out.append("{");
            for (int j = 0; j < value[i].length; j++) {

                out.append(value[i][j]);

                if (i < value[i].length - 1) {
                    out.append(", ");
                }
                out.append("}");


            }

        }



        return out.toString();
    }
}
