package by.it.skorobogatyi.calc.variables;

import by.it.skorobogatyi.calc.utils.Operation;

class Scalar extends AbstractVar implements Operation {

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
    public AbstractVar add(AbstractVar other) {
        return other.add(this);
    }

    @Override
    public AbstractVar add(Scalar other) {
        double returnValue = other.value + this.value;
        return new Scalar(returnValue);
    }

    @Override
    public AbstractVar add(Vector other) {
        return other.add(this);
    }

    @Override
    public AbstractVar add(Matrix other) {
        return other.add(this);
    }


    @Override
    public AbstractVar sub(AbstractVar other) {
        return other.sub(this);
    }

    @Override
    public AbstractVar sub(Scalar other) {
        double returnValue = other.value - this.value;
        return new Scalar(returnValue);
    }

    @Override
    public AbstractVar sub(Vector other) {
        return other.sub(this);
    }

    @Override
    public AbstractVar sub(Matrix other) {
        return other.sub(this);
    }



    @Override
    public AbstractVar mul(AbstractVar other) {
       return other.mul(this);
    }

    @Override
    public AbstractVar mul(Scalar other) {
        double returnValue = other.value * this.value;
        return new Scalar(returnValue);
    }

    @Override
    public AbstractVar mul(Vector other) {
        return other.mul(this);
    }

    @Override
    public AbstractVar mul(Matrix other) {
        return other.mul(this);
    }


    @Override
    public AbstractVar div(AbstractVar other) {
        return other.div(this);
    }

    @Override
    public AbstractVar div(Scalar other) {
        if (this.value != 0) {
            double returnValue = other.value / this.value;
            return new Scalar(returnValue);
        }

        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;

    }

    @Override
    public AbstractVar div(Vector other) {
        return other.div(this);
    }

    @Override
    public AbstractVar div(Matrix other) {
        return other.div(this);
    }

}
