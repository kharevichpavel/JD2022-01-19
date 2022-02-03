package by.it.tarend.jd01_07;

public class Vector extends Var{

    private final double[] value;

    public Vector(double[] value) {
        this.value = value.clone();
    }

    public double[] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {
        StringBuilder outPut = new StringBuilder();
        String delimiter = "";
        outPut.append('{');
        for (double element : value) {
            outPut.append(delimiter).append(element);
            delimiter = ", ";
        }
        outPut.append("}");
        return outPut.toString();
    }
}
