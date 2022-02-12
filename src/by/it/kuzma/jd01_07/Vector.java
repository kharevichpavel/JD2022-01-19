package by.it.kuzma.jd01_07;

class Vector extends Var {

    private final double[] value;

    public Vector(double[] vale) {
        this.value = vale.clone();
    }

    public Vector(Vector otherVector) {
        this.value = otherVector.value.clone();
    }

    public Vector(String strVector) {
        strVector = strVector.replaceAll("[{}]", "");

        String[] arrVector = strVector.split(",");
        value = new double[arrVector.length];
        for (int i = 0; i < arrVector.length; i++) {
            value[i] = Double.parseDouble(arrVector[i]);
        }

    }

    public double[] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append('{');
        String delimiter = "";
        for (double element : value){
            out.append(delimiter).append(element);
            delimiter = ", ";
        }
        out.append('}');
        return  out.toString();
    }
}
