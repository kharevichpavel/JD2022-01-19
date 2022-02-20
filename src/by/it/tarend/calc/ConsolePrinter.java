package by.it.tarend.calc;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var var) {
        if (var != null) {
            System.out.println(var);
        }
    }
}
