package by.it.kravchenko.jd01_08;

class Scalar extends Var {
    private final double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String stringValue) {
        this.value = Double.parseDouble(stringValue);
    }

    public Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value + otherScalar.value);
        } else
            return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value - otherScalar.value);
        }
        return other.sub(this).mul(new Scalar(-1));
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value * otherScalar.value);
        }
        return other.mul(this);


    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value / otherScalar.value);
        }
        return super.div(other);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}

