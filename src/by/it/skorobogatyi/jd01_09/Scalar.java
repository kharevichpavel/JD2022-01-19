package by.it.skorobogatyi.jd01_09;

class Scalar extends Var implements Operation {

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
        return other.add(this);
    }

    @Override
    public Var add(Scalar other) {
        double returnValue = other.value + this.value;
        return new Scalar(returnValue);
    }

    @Override
    public Var add(Vector other) {
        return other.add(this);
    }

    @Override
    public Var add(Matrix other) {
        return other.add(this);
    }


    @Override
    public Var sub(Var other) {
        return other.sub(this);
    }

    @Override
    public Var sub(Scalar other) {
        double returnValue = other.value - this.value;
        return new Scalar(returnValue);
    }

    @Override
    public Var sub(Vector other) {
        return other.sub(this);
    }

    @Override
    public Var sub(Matrix other) {
        return other.sub(this);
    }



    @Override
    public Var mul(Var other) {
       return other.mul(this);
    }

    @Override
    public Var mul(Scalar other) {
        double returnValue = other.value * this.value;
        return new Scalar(returnValue);
    }

    @Override
    public Var mul(Vector other) {
        return other.mul(this);
    }

    @Override
    public Var mul(Matrix other) {
        return other.mul(this);
    }


    @Override
    public Var div(Var other) {
        return other.div(this);
    }

    @Override
    public Var div(Scalar other) {
        if (this.value != 0) {
            double returnValue = other.value / this.value;
            return new Scalar(returnValue);
        }

        return other.div(this);

    }

    @Override
    public Var div(Vector other) {
        return other.div(this);
    }

    @Override
    public Var div(Matrix other) {
        return other.div(this);
    }

}
