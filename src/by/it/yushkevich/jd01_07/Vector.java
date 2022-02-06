package by.it.yushkevich.jd01_07;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vector extends Var {

    private double[] value;

    public Vector(double[] value) {

        this.value = value.clone();//т.к. хранится ссылка, то наш массив могут изменить извне, поэтому делаем клон

    }

    public Vector(Vector vector) {
        this.value = vector.value;

    }

    public double[] getValue() {
        return value.clone();
    }


    public Vector(String vector) {

        double[] buff = {};
        String regex = "[0-9.]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(vector);
        while (matcher.find()) {
            String text = matcher.group();
            double parseText = Double.parseDouble(text);
            buff = Arrays.copyOf(buff, buff.length + 1);
            buff[buff.length - 1] = parseText;

        }
        this.value = buff;


    }


    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("{");

        for (int i = 0; i < value.length; i++) {
            double element = value[i];
            out.append(element);
            if (i < value.length - 1) {
                out.append(", ");
            }

        }
        out.append("}");

        return out.toString();


    }
}
