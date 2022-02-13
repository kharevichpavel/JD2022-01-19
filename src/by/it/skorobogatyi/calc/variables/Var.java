package by.it.skorobogatyi.calc.variables;

import by.it.skorobogatyi.calc.utils.CustomPatterns;
import by.it.skorobogatyi.calc.utils.Operation;

public abstract class Var implements Operation {


    public static Var create(String varValue) {

        if (varValue.matches(CustomPatterns.SCALAR)) {
            return new Scalar(varValue);

        } else if (varValue.matches(CustomPatterns.VECTOR)) {
            return new Vector(varValue);

        } else if (varValue.matches(CustomPatterns.MATRIX)) {
            return new Matrix(varValue);

        } else {
            System.out.println("Unknown variable");
            return null;
        }

    }

    @Override
    public abstract Var add(Var other);

    public abstract Var add(Scalar other);

    public abstract Var add(Vector other);

    public abstract Var add(Matrix other);


    @Override
    public abstract Var sub(Var other);

    public abstract Var sub(Scalar other);

    public abstract Var sub(Vector other);

    public abstract Var sub(Matrix other);


    @Override
    public abstract Var mul(Var other);

    public abstract Var mul(Scalar other);

    public abstract Var mul(Vector other);

    public abstract Var mul(Matrix other);


    @Override
    public abstract Var div(Var other);

    public abstract Var div(Scalar other);

    public abstract Var div(Vector other);

    public abstract Var div(Matrix other);


    @Override
    public String toString() {
        return "Unknown variable";
    }
}
