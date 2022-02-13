package by.it.skorobogatyi.calc.variables;

import by.it.skorobogatyi.calc.utils.CustomPatterns;
import by.it.skorobogatyi.calc.utils.Operation;
import by.it.skorobogatyi.calc.utils.VariablesStorage;

public abstract class AbstractVar implements Operation {

    public static AbstractVar create(String varValue) {

        if (varValue.matches(CustomPatterns.SCALAR)) {
            return new Scalar(varValue);

        } else if (varValue.matches(CustomPatterns.VECTOR)) {
            return new Vector(varValue);

        } else if (varValue.matches(CustomPatterns.MATRIX)) {
            return new Matrix(varValue);

        } else if (varValue.matches(CustomPatterns.VARIABLE)) {

            if (VariablesStorage.variables.containsKey(varValue)) {
                return VariablesStorage.variables.get(varValue);
            } else {
                return new Variable(varValue);
            }

        } else if (varValue.matches(CustomPatterns.COMMAND_PRINTVAR)) {
            System.out.println(VariablesStorage.printVar());
            return null;

        } else if (varValue.matches(CustomPatterns.COMMAND_SORTVAR)) {
            System.out.println(VariablesStorage.sortVar());
            return null;

        } else {
            System.out.println("Unknown variable");
            return null;
        }
    }

    @Override
    public abstract AbstractVar add(AbstractVar other);

    public abstract AbstractVar add(Scalar other);

    public abstract AbstractVar add(Vector other);

    public abstract AbstractVar add(Matrix other);


    @Override
    public abstract AbstractVar sub(AbstractVar other);

    public abstract AbstractVar sub(Scalar other);

    public abstract AbstractVar sub(Vector other);

    public abstract AbstractVar sub(Matrix other);


    @Override
    public abstract AbstractVar mul(AbstractVar other);

    public abstract AbstractVar mul(Scalar other);

    public abstract AbstractVar mul(Vector other);

    public abstract AbstractVar mul(Matrix other);


    @Override
    public abstract AbstractVar div(AbstractVar other);

    public abstract AbstractVar div(Scalar other);

    public abstract AbstractVar div(Vector other);

    public abstract AbstractVar div(Matrix other);


    @Override
    public String toString() {
        return "Unknown variable";
    }
}
