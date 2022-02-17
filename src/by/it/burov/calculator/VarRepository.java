package by.it.burov.calculator;

import java.util.HashMap;
import java.util.Map;

public class VarRepository {

    private static Map<String,Var> vars=new HashMap<>();

    Var saveVars(String name, Var var){
        vars.put(name,var);
        return var;
    }

    Var getByName(String name){
        return vars.get(name);
    }

    public Var createVar(String varValueForName) throws CalcException {
        if (varValueForName.matches(Patterns.SCALAR)) {
            return new Scalar(varValueForName);
        } else if (varValueForName.matches(Patterns.VECTOR)) {
            return new Vector(varValueForName);
        } else if (varValueForName.matches(Patterns.MATRIX)) {
            return new Matrix(varValueForName);
        } else if (vars.containsKey(varValueForName)){
            return getByName(varValueForName);
        }
        throw new CalcException("not found "+varValueForName);
    }
}
