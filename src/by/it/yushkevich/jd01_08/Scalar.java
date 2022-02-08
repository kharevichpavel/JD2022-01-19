package by.it.yushkevich.jd01_08;

class Scalar extends Var {


    private double value;

    public Scalar() {
        super();
    }

    public Scalar(double value) {

        this.value = value;

    }


    public Scalar(Scalar otherScalar) {

        this.value = otherScalar.value;

    }


    public Scalar(String stringValue) {

        value = Double.parseDouble(stringValue);
    }


    @Override
    public Var add(Var other) {
        if (other instanceof Scalar){
            Scalar otherScalar = (Scalar) other;
            double result = this.value + otherScalar.value;
            return new Scalar(result);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        return super.div(other);
    }



    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        //делаем из дабла строку
        return Double.toString(value);
    }
}
