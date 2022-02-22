package by.it.chaikova.jd01_07;

 class Vector extends Var{
    private final double[] value;
    public Vector(double [] value){
        this.value=value.clone();
    }

    public double[] getValue() {
        return value.clone();
    }

    public String toString(){
        StringBuilder out= new StringBuilder();
        out.append('{');
        String delimiter="";
       for (double element : value){
           out.append(delimiter).append(element);
delimiter=", ";
        }
       out.append("}");
        return out.toString();
    }
}
