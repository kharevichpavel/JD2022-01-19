package by.it.kharevich.calculator;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var var) {
        if (var!=null){
            System.out.println(var);
        }
    }
}
