package by.it.burov.calculator;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var variable) {
        if(variable!=null){
            System.out.println(variable);
        }
    }

    @Override
    public void print(Exception e) {
        System.out.println(e.getMessage());
    }
}
