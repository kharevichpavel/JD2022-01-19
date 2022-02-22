package by.it.skorobogatyi.calc.variables;

import by.it.skorobogatyi.calc.utils.CalcException;
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
    public AbstractVar add(AbstractVar other) throws CalcException {
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
    public AbstractVar add(Vector other) throws CalcException {

        if (this.value.length == other.value.length) {

            double[] localValue = value.clone();
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] += other.value[i];
            }
            return new Vector(localValue);
        }

        String message = String.format("Operation addition %s + %s impossible%n", other, this);
        throw new CalcException(message);
    }

    @Override
    public AbstractVar add(Matrix other) throws CalcException {
        String message = String.format("Operation addition %s + %s impossible%n", this, other);
        throw new CalcException(message);
    }


    @Override
    public AbstractVar sub(AbstractVar other) throws CalcException {
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
    public AbstractVar sub(Vector other) throws CalcException {

        if (this.value.length == other.value.length) {

            double[] localValue = value.clone();
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] = other.value[i] - localValue[i];
            }
            return new Vector(localValue);

        }
        String message = String.format("Operation subtraction %s - %s impossible%n", other, this);
        throw new CalcException(message);
    }

    @Override
    public AbstractVar sub(Matrix other) throws CalcException {
        String message = String.format("Operation subtraction %s - %s impossible%n", this, other);
        throw new CalcException(message);
    }


    @Override
    public AbstractVar mul(AbstractVar other) throws CalcException {
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
    public AbstractVar mul(Vector other) throws CalcException {

        if (this.value.length == other.value.length) {
            double[] localValue = value.clone();
            double vectorInnerSum = 0;

            for (int i = 0; i < localValue.length; i++) {
                localValue[i] = other.value[i] * localValue[i];
                vectorInnerSum += localValue[i];
            }

            return new Scalar(vectorInnerSum);
        }

        String message = String.format("Operation multiplication %s * %s impossible%n", this, other);
        throw new CalcException(message);
    }

    @Override
    public AbstractVar mul(Matrix other) throws CalcException {
        return other.mul(this);
    }


    @Override
    public AbstractVar div(AbstractVar other) throws CalcException {
        return other.div(this);
    }

    @Override
    public AbstractVar div(Scalar other) throws CalcException {
        String message = String.format("Operation division %s / %s impossible%n", other, this);
        throw new CalcException(message);
    }

    @Override
    public AbstractVar div(Vector other) throws CalcException {
        String message = String.format("Operation division %s / %s impossible%n", other, this);
        throw new CalcException(message);
    }

    @Override
    public AbstractVar div(Matrix other) throws CalcException {
        String message = String.format("Operation division %s / %s impossible%n", other, this);
        throw new CalcException(message);
    }


}

