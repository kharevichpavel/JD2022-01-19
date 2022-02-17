package by.it.yushkevich.jd01_09;
//TODO do this task one more time by yourself
abstract class Var implements Operation {

    public static Var create(String varValue) {
        if (varValue.matches(Patterns.SCALAR)){
            return new Scalar(varValue);
        }
        else if (varValue.matches(Patterns.VECTOR)){
            return new Vector(varValue);
        }
        else if (varValue.matches(Patterns.MATRIX)){
            return new Matrix(varValue);
        }
        return null;//TODO exception
    }

    @Override
     public Var add(Var other) {
         System.out.printf("Operation 'ADD' %s + %s impossible%n", this, other);
         return null;
     }

     @Override
     public Var sub(Var other) {
         System.out.printf("Operation 'SUB' %s - %s impossible%n", this, other);
         return null;
     }

     @Override
     public Var mul(Var other) {
         System.out.printf("Operation 'MUL' %s * %s impossible%n", this, other);
         return null;
     }

     @Override
     public Var div(Var other) {
         System.out.printf("Operation 'DIV' %s \\ %s impossible%n", this, other);
         return null;
     }

     @Override
    public String toString() {
        return "abstract variable";
    }
}
