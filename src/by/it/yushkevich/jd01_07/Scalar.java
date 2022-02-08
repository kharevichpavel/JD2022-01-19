package by.it.yushkevich.jd01_07;

 class Scalar extends Var{

    private double value;

    public Scalar(){
        super();
    }

    public Scalar(double value){

       this.value = value;

    }

    public double getValue() {
        return value;
    }



    public Scalar(Scalar scalar){
        this.value = scalar.value;

    }

    public Scalar(String stringValue){

        value = Double.parseDouble(stringValue);
    }

    @Override
    public String toString() {
        //делаем из дабла строку
        return Double.toString(value);
    }
}
