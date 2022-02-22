package by.it.skorobogatyi.calc.printers;

import by.it.skorobogatyi.calc.utils.CalcException;
import by.it.skorobogatyi.calc.variables.AbstractVar;

public interface Printer {
    void print(AbstractVar abstractVar);

    void print(CalcException e);
}
