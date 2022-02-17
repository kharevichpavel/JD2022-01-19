package by.it.skorobogatyi.jd01_09.variables;

import by.it.skorobogatyi.jd01_09.utils.Operation;

class Vector extends Var implements Operation {

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
    public Var add(Var other) {
        return other.add(this);
    }

    @Override
    public Var add(Scalar other) {

        double[] localValue = value.clone();
        for (int i = 0; i < localValue.length; i++) {
            localValue[i] += other.getValue();
        }
        return new Vector(localValue);
    }

    @Override
    public Var add(Vector other) {

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
    public Var add(Matrix other) {
        System.out.printf("Operation addition %s + %s impossible%n", this, other);
        return null;
    }


    @Override
    public Var sub(Var other) {
        return other.sub(this);
    }

    @Override
    public Var sub(Scalar other) {

        double[] localValue = value.clone();
        for (int i = 0; i < localValue.length; i++) {
            localValue[i] = localValue[i] - other.getValue();
        }
        return new Vector(localValue);
    }

    @Override
    public Var sub(Vector other) {

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
    public Var sub(Matrix other) {
        System.out.printf("Operation subtraction %s - %s impossible%n", this, other);
        return null;
    }


    @Override
    public Var mul(Var other) {
        return other.mul(this);
    }

    @Override
    public Var mul(Scalar other) {

        double[] localValue = value.clone();
        for (int i = 0; i < localValue.length; i++) {
            localValue[i] = other.getValue() * localValue[i];
        }
        return new Vector(localValue);
    }

    @Override
    public Var mul(Vector other) {

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
    public Var mul(Matrix other) {
        return other.mul(this);
    }


    @Override
    public Var div(Var other) {
        return other.div(this);
    }

    @Override
    public Var div(Scalar other) {

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
    public Var div(Vector other) {
        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;
    }

    @Override
    public Var div(Matrix other) {
        System.out.printf("Operation division %s / %s impossible%n", this, other);
        return null;
    }


}

