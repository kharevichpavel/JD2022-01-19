package by.it.chaikova.jd01_09;

class Vector extends Var {
    private final double[] value;
    public Vector(double [] value){
        this.value=value.clone();
    }

    public Vector(String value) {
        this.value= new double[]{};
    }

    public double[] getValue() {
        return value.clone();
    }

    @Override
    public Var add(Var other) {
        double[] localValue = getValue();
        if (other instanceof Scalar scalar){
            for (int i = 0; i < localValue.length; i++) {
                localValue[i]+=scalar.getValue();
            }
            return new Vector(localValue);
        } else if (other instanceof Vector vector) {
            if (this.value.length == vector.value.length) {
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
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        double[] localValue = getValue();
        if (other instanceof Scalar scalar){
            for (int i = 0; i < localValue.length; i++) {
                localValue[i]*=scalar.getValue();
            }
            return new Vector(localValue);
        } else if (other instanceof Vector vector) {
            if (this.value.length == vector.value.length) {
                for (int i = 0; i < localValue.length; i++) {
                    localValue[i] *= vector.value[i];
                }
                return new Vector(localValue);
            }
        }
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        return super.div(other);
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
