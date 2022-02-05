package by.it.kravchenko.jd01_07;

public class Vector extends Var {
    private final double[] value;

    public Vector(double[] value) {
        this.value = value.clone();
    }

    public Vector(Vector vector) {
        this.value = vector.value.clone();
    }

    public Vector(String strVector) {

        strVector = strVector.replaceAll("[{}]+", "");
        String[] arrayVector = strVector.split(",");
        value = new double[arrayVector.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(arrayVector[i]);
        }
    }

    public double[] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("{");
        String delimiter = "";
        for (double elem : value) {
            out.append(delimiter).append(elem);
            delimiter = ", ";
        }
        out.append("}");
        return out.toString();


    }

}
