package by.it.kharevich.jd01_07;

public class Vector extends Var {

    private final double[] value;

    public Vector(double[] value) {
        this.value = value.clone();
    }
    public double[] getValue() {
        return value.clone();
    }

    public Vector(Vector otherVector) {
        this.value = otherVector.value.clone();
    }



    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append('{');
        String delimiter = "";
        for (double element : value) {
            out.append(delimiter).append(element);
            delimiter = ", ";
        }
        out.append("}");
        return out.toString();
    }


}
