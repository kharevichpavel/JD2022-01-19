package by.it.skorobogatyi.jd01_09.utils;

import by.it.skorobogatyi.jd01_09.variables.Var;

public interface Operation {

    Var add(Var other);

    Var sub(Var other);

    Var mul(Var other);

    Var div(Var other);

}
