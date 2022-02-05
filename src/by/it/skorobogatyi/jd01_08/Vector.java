package by.it.skorobogatyi.jd01_08;

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

        if (other instanceof Scalar scalar) {
            double[] localValue = value.clone();

            for (int i = 0; i < localValue.length; i++) {
                localValue[i] += scalar.getValue();
            }

            return new Vector(localValue);

        } else if (other instanceof Vector vector) {

            if (this.value.length == vector.value.length) {

                double[] localValue = value.clone();
                for (int i = 0; i < localValue.length; i++) {
                    localValue[i] += vector.value[i];
                }

                return new Vector(localValue);
            }
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {

        if (other instanceof Scalar scalar) {
            double[] localValue = value.clone();

            for (int i = 0; i < localValue.length; i++) {
                localValue[i] -= scalar.getValue();
            }

            return new Vector(localValue);

        } else if (other instanceof Vector vector) {

            if (this.value.length == vector.value.length) {
                double[] localValue = value.clone();

                for (int i = 0; i < localValue.length; i++) {
                    localValue[i] -= vector.value[i];
                }

                return new Vector(localValue);
            }
        }
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {

        if (other instanceof Scalar scalar) {
            double[] localValue = value.clone();

            for (int i = 0; i < localValue.length; i++) {
                localValue[i] *= scalar.getValue();
            }

            return new Vector(localValue);

        } else if (other instanceof Vector vector) {

            if (this.value.length == vector.value.length) {
                double[] localValue = value.clone();
                double vectorInnerSum = 0;

                for (int i = 0; i < localValue.length; i++) {
                    localValue[i] *= vector.value[i];
                    vectorInnerSum += localValue[i];
                }

                return new Scalar(vectorInnerSum);
            }
        }
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {

        if (other instanceof Scalar scalar) {
            double[] localValue = value.clone();

            for (int i = 0; i < localValue.length; i++) {
                localValue[i] /= scalar.getValue();
            }

            return new Vector(localValue);

        }
        return super.div(other);
    }
}

