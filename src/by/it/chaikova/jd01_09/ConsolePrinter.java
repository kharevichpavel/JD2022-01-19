package by.it.chaikova.jd01_09;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var var) {
        if (var!= null) System.out.println(var);

    }
}
