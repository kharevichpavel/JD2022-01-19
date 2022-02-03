package by.it.kravchenko.jd01_07;

public class Scalar extends Var{
    private final double value;
    public Scalar(double value){
        this.value=value;
    }
    public Scalar(String stringValue){
        this.value=Double.parseDouble(stringValue);
    }
    public Scalar(Scalar scalar){
        this.value=scalar.value;
    }
    public double getValue(){
        return value;
    }
    public String toString(){
        return Double.toString(value);
    }

}
