package by.it.skorobogatyi.calc.variables;

import by.it.skorobogatyi.calc.utils.Operation;

class Vector extends AbstractVar implements Operation {

    private final double[] value;


    public Vector(double[] value) {
        this.value = value.clone();
    }


    public Vector(Vector otherVector) {
        this.value = otherVector.value.clone();
    }


    public Vector(String strVector) {

        strVector = strVector.replaceAll("[{}\\s]+", "");
        String[] stringsArray = strVector.split(",");

        value = new double[stringsArray.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(stringsArray[i]);
        }
    }


    public double[] getValue() {
        return value.clone();
    }

    @Override
    public String toString() {

        StringBuilder returnString = new StringBuilder();

        returnString.append("{");

        for (int i = 0; i < value.length - 1; i++) {
            double element = value[i];
            returnString.append(element).append(", ");
        }

        returnString.append(value[value.length - 1]).append("}");

        return String.valueOf(returnString);
    }


    @Override
    public AbstractVar add(AbstractVar other) {
        return other.add(this);
    }

    @Override
    public AbstractVar add(Scalar other) {

        double[] localValue = value.clone();
        for (int i = 0; i < localValue.length; i++) {
            localValue[i] += other.getValue();
        }
        return new Vector(localValue);
    }

    @Override
    public AbstractVar add(Vector other) {

        if (this.value.length == other.value.length) {

            double[] localValue = value.clone();
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] += other.value[i];
            }
            return new Vector(localValue);
        }

        System.out.printf("Operation addition %s + %s impossible%n", this, other);
        return null;
    }

    @Override
    public AbstractVar add(Matrix other) {
        System.out.printf("Operation addition %s + %s impossible%n", this, other);
        return null;
    }


    @Override
    public AbstractVar sub(AbstractVar other) {
        return other.sub(this);
    }

    @Override
    public AbstractVar sub(Scalar other) {

        double[] localValue = value.clone();
        for (int i = 0; i < localValue.length; i++) {
            localValue[i] = localValue[i] - other.getValue();
        }
        return new Vector(localValue);
    }

    @Override
    public AbstractVar sub(Vector other) {

        if (this.value.length == other.value.length) {

            double[] localValue = value.clone();
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] = other.value[i] - localValue[i];
            }
            return new Vector(localValue);

        }
        System.out.printf("Operation subtraction %s - %s impossible%n", this, other);
        return null;
    }

    @Override
    public AbstractVar sub(Matrix other) {
        System.out.printf("Operation subtraction %s - %s impossible%n", this, other);
        return null;
    }


    @Override
    public AbstractVar mul(AbstractVar other) {
        return other.mul(this);
    }

    @Override
    public AbstractVar mul(Scalar other) {

        double[] localValue = value.clone();
        for (int i = 0; i < localValue.length; i++) {
            localValue[i] = other.getValue() * localValue[i];
        }
        return new Vector(localValue);
    }

    @Override
    public AbstractVar mul(Vector other) {

        if (this.value.length == other.value.length) {
            double[] localValue = value.clone();
            double vectorInnerSum = 0;

            for (int i = 0; i < localValue.length; i++) {
                localValue[i] = other.value[i] * localValue[i];
                vectorInnerSum += localValue[i];
            }

            return new Scalar(vectorInnerSum);
        }

        System.out.printf("Operation multiplication %s * %s impossible%n", this, other);
        return null;
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

        if (other.getValue() != 0) {

            double[] localValue = value.clone();
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] = localValue[i] / other.getValue();
            }
            return new Vector(localValue);
        }

        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;
    }

    @Override
    public AbstractVar div(Vector other) {
        System.out.printf("Operation division %s / %s impossible%n", other, this);
        return null;
    }

    @Override
    public AbstractVar div(Matrix other) {
        System.out.printf("Operation division %s / %s impossible%n", other, this);
        return null;
    }


}

