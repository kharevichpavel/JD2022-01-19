package by.it.zaretskaya.jd01_08;

class Vector extends by.it.zaretskaya.jd01_08.Var {
private double[] value;

public Vector(double[] value) {
 this.value = value.clone();
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
