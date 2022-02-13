package by.it.skorobogatyi.calc.utils;

import by.it.skorobogatyi.calc.variables.AbstractVar;

public interface Operation {

    AbstractVar add(AbstractVar other);

    AbstractVar sub(AbstractVar other);

    AbstractVar mul(AbstractVar other);

    AbstractVar div(AbstractVar other);

}
