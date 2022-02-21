package by.it.chaikova.jd01_09;

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
        if (other instanceof Scalar otherScalar){
           return new Scalar( this.value+otherScalar.value);
        } else
        return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar otherScalar){
            return new Scalar( this.value - otherScalar.value);
        }
        return other.sub(this).mul(new Scalar(-1));
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar otherScalar){
            return new Scalar( this.value * otherScalar.value);
        }
        return other.add(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar otherScalar){
            if (otherScalar.value==0){
                return super.div(other);
            }
            return new Scalar( this.value / otherScalar.value);
        }
        return super.div(other);
    }

    public double getValue() {
        return value;
    }


    public String toString() {
        return Double.toString(value);
    }
}
