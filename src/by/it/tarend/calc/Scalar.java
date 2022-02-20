package by.it.tarend.calc;

class Scalar extends Var {

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
    public Var add(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value + otherScalar.value);
        } else return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value - otherScalar.value);
        } else
            return other.div(this).mul(new Scalar(-1));
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value * otherScalar.value);
        } else
            return other.mul(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar otherScalar) {
            if (otherScalar.value == 0) {
                return super.div(other); // TODO replace with Exception
            }
            return new Scalar(this.value / otherScalar.value);
        }
        return super.div(other);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }


    public double getValue() {
        return value;
    }
}
