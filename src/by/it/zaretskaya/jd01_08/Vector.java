package by.it.zaretskaya.jd01_08;

class Vector extends by.it.zaretskaya.jd01_08.Var {
private final double[] value;

public Vector(double[] value) {
 this.value = value.clone();
}

 public double[] getValue() {return value.clone(); }

 @Override
 public Var add(Var other) {
 if(other instanceof Scalar scalar){
  double[] localValue = value.clone();
  for (int i = 0; i < localValue.length; i++) {
   localValue[i]+=scalar.getValue();
  }
  return new Vector (localValue);
 }else if (other instanceof Vector vector ) {
  if (this.value.length == vector.value.length) {
   for (int i = 0; i < value.length; i++) {
    value[i] += vector.value[i];
   }
   return new Vector(value);
  }
 }
  return super.add(other);
 }

 @Override
public String toString () {
 StringBuilder out = new StringBuilder();
 out.append("{");
 String delimiter="";
 for (double element:value) {
  out.append(delimiter).append(element);
  delimiter=", ";

  }
 out.append("}");
return out.toString();

}
}
