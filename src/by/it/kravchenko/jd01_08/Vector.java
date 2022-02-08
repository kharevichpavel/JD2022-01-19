package by.it.kravchenko.jd01_08;

class Vector extends Var {
    private final double[] value;

    public Vector(double[] value) {
        this.value = value.clone();
    }

    public Vector(Vector vector) {
        this.value = vector.value.clone();
    }

    public Vector(String strVector) {

        strVector = strVector.replaceAll("[{}]", "");
        String[] arrayVector = strVector.split(",");
        value = new double[arrayVector.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Double.parseDouble(arrayVector[i]);
        }
    }

    @Override
    public Var add(Var other) {
        double[] localValue = value.clone();
        if (other instanceof Scalar otherScalar) {
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] += otherScalar.getValue();
            }
            return new Vector(localValue);
        } else if (other instanceof Vector otherVector) {
            if (this.value.length == otherVector.value.length) {
                for (int i = 0; i < localValue.length; i++) {
                    localValue[i] += otherVector.value[i];
                }
                return new Vector(localValue);

            }
        }

        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        double[] localValue = value.clone();
        if (other instanceof Scalar otherScalar) {
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] -= otherScalar.getValue();
            }
            return new Vector(localValue);
        } else if (other instanceof Vector otherVector) {
            if (this.value.length == otherVector.value.length) {
                for (int i = 0; i < localValue.length; i++) {
                    localValue[i] -= otherVector.value[i];
                }
                return new Vector(localValue);
            }
        }

        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        double[] localValue = value.clone();
        if (other instanceof Scalar otherScalar) {
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] *= otherScalar.getValue();
            }
            return new Vector(localValue);
        } else if (other instanceof Vector otherVector) {
            if (localValue.length == otherVector.value.length) {
                double res = 0.0;
                for (int i = 0; i < localValue.length; i++) {

                    res += localValue[i] * otherVector.value[i];
                }
                return new Scalar(res);
            }
        }
        return super.mul(other);
    }

    public double[] getValue() {
        return value.clone();
    }

    @Override
    public Var div(Var other) {
        double[] localValue = value.clone();
        if (other instanceof Scalar otherScalar) {
            for (int i = 0; i < localValue.length; i++) {
                localValue[i] /= otherScalar.getValue();
            }
            return new Vector(localValue);
        }
        return super.div(other);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("{");
        String delimiter = "";
        for (double elem : value) {
            out.append(delimiter).append(elem);
            delimiter = ", ";
        }
        out.append("}");
        return out.toString();


    }

}
