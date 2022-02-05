package by.it.tarend.jd01_08;

class Vector extends Var {

    private double[] value;

    public Vector(double[] value) {
        this.value = value.clone();
    }

    public Vector(Vector otherVector) {
        this.value = otherVector.value.clone();
    }

    public Vector(String strVector) {
        String[] vector = strVector.replaceAll("[/{/}]", "").split(",");
        double[] value = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            value[i] = Double.parseDouble(vector[i]);
        }
        this.value = value.clone();
    }

    public double[] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {
        StringBuilder outPut = new StringBuilder();
        String delimiter = "";
        outPut.append("{");
        for (double element : value) {
            outPut.append(delimiter).append(element);
            delimiter = ", ";
        }
        outPut.append("}");
        return outPut.toString();
    }
}
