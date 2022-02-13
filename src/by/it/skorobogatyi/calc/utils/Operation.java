package by.it.skorobogatyi.calc.utils;

import by.it.skorobogatyi.calc.variables.Var;

public interface Operation {

    Var add(Var other);

    Var sub(Var other);

    Var mul(Var other);

    Var div(Var other);

}
