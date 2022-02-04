package by.it.burov.jd01_07;

public class Scalar extends Var{

    private double value;

    public Scalar(String stringValue){
        value = Double.parseDouble(stringValue);
    }

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(Scalar otherVector) {
        value = otherVector.value;
    }

    public double getValue(){
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
