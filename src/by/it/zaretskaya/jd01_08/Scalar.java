package by.it.zaretskaya.jd01_08;

import by.it.zaretskaya.jd01_08.Var;

class Scalar extends Var {
    private final double value;

    public Scalar(String stringValue) {
        value=Double.parseDouble(stringValue);
    }

    public Scalar(double value) {
        this.value=value;
    }

    public Scalar(Scalar otherScalar) {
        this.value=otherScalar.value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            Scalar otherScalar = (Scalar) other;
            double result = this.value + otherScalar.value;
            return new Scalar(result);


        }
        return super.add(other);
}


    public double getValue() {
        return value;
    }



    @Override
    public String toString() {
        return Double.toString(value);
    }
}
