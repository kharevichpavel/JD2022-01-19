package by.it.tarend.calc.view;

import by.it.tarend.calc.model.Var;

public interface Printer {
    void print(Var var);
    void printError(Exception var);
}
