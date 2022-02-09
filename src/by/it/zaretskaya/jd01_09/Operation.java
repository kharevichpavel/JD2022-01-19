package by.it.zaretskaya.jd01_09;

import by.it.zaretskaya.jd01_09.Var;

interface Operation {
    Var add(Var other);

    Var sub(Var other);

    Var mul(Var other);

    Var div(Var other);
}