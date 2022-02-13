package by.it.skorobogatyi.jd01_09.printers;

import by.it.skorobogatyi.jd01_09.variables.Var;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var var) {
        if (var != null) {
            System.out.println(var);
        }
    }
}
