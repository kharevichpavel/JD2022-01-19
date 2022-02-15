package by.it.burov.calc;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var variable) {
        if(variable!=null){
            System.out.println(variable);
        }
    }
}
