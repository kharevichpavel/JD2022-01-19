package by.it.tarend.jd01_07;

class Scalar extends Var{

    private double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String stringValue) {
        value = Double.parseDouble(stringValue);
    }

    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }


    public double getValue() {
        return value;
    }
}
