package by.it.skorobogatyi.jd01_08;

class Scalar extends Var implements Operation{

    private final double value;

    public double getValue() {
        return value;
    }

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }

    public Scalar(String strScalar) {
        value = Double.parseDouble(strScalar);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public Var add(Var other) {

        if (other instanceof Scalar otherScalar) {
            double result = this.value + otherScalar.value;
            return new Scalar(result);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {

        if (other instanceof Scalar otherScalar) {
            double result = this.value - otherScalar.value;
            return new Scalar(result);
        }
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {

        if (other instanceof Scalar otherScalar) {
            double result = this.value * otherScalar.value;
            return new Scalar(result);
        }
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {

        if (other instanceof Scalar otherScalar) {
            if (otherScalar.value == 0) {
                return super.div(other);
            }
            double result = this.value / otherScalar.value;
            return new Scalar(result);
        }
        return super.div(other);
    }
}
