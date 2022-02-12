package by.it.burov.jd01_07;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Vector extends Var{

    private final double[] value;

    public Vector(double[] value) {
        this.value = value.clone();
    }

    public Vector(Vector otherVector){
        this.value = otherVector.value.clone();
    }

    public Vector(String stringValue) {
        Pattern pattern = Pattern.compile("[\\d.?\\d]+");
        Matcher matcher = pattern.matcher(stringValue);
        String[] stringArray = {};
        while (matcher.find()) {
            String digit = matcher.group();
            stringArray = Arrays.copyOf(stringArray, stringArray.length + 1);
            stringArray[stringArray.length - 1] = digit;
        }
        double[] doubleArray = new double[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            doubleArray[i] = Double.parseDouble(stringArray[i]);
        }
        this.value = doubleArray;
    }

    public double[] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('{');
        String delimiter = "";
        for (double element : value) {
            builder.append(delimiter).append(element);
            delimiter=", ";
        }
        builder.append('}');
        return builder.toString();
        }
}
