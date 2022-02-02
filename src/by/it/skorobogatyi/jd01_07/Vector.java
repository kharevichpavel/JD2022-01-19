package by.it.skorobogatyi.jd01_07;

public class Vector extends Var {

    private final double[] value;


    public Vector(double[] value) {
        this.value = value.clone();
    }


    public Vector(Vector otherVector) {
        this.value = otherVector.value.clone();
    }


    public Vector(String strVector) {

        strVector = strVector.replaceAll("[{}\\s]+", "");
        String[] stringsArray = strVector.split(",");

        value = new double[stringsArray.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble( stringsArray[i]);
        }
    }


    public double[] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("{");
        for (int i = 0; i < value.length - 1; i++) {
            double element = value[i];
            returnString.append(element).append(", ");
        }
        returnString.append(value[value.length - 1]).append("}");
        return String.valueOf(returnString);
    }
}
