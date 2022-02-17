package by.it.zaretskaya.calculator;

class Scalar extends Var {
    private final double value;

    public Scalar(String stringValue) {
        value = Double.parseDouble(stringValue);
    }

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value + otherScalar.value);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value - otherScalar.value);
        }
        return super.add(other);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar otherScalar) {
            return new Scalar(this.value * otherScalar.value);
        }
        return super.add(other);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar otherScalar) {
            if (otherScalar.value == 0) {
                System.out.printf("ERROR: division by zero %s / %s%n", this, other);
                return null;
            }

            return new Scalar(this.value / otherScalar.value);
        }

            return super.add(other);
        }

        public double getValue () {return value;}


        @Override
        public String toString () {return Double.toString(value);}
    }

