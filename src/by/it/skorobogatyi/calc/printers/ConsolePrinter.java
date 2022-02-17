package by.it.skorobogatyi.calc.printers;

import by.it.skorobogatyi.calc.variables.AbstractVar;

public class ConsolePrinter implements Printer {
    @Override
    public void print(AbstractVar abstractVar) {
        if (abstractVar != null) {
            System.out.println(abstractVar);
        }
    }
}
