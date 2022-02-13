package by.it.skorobogatyi.calc.printers;

import by.it.skorobogatyi.calc.variables.Var;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var var) {
        if (var != null) {
            System.out.println(var);
        }
    }
}
