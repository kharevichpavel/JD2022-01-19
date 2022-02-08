package by.it.burov.jd01_09;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var variable) {
        if(variable!=null){
            System.out.println(variable);
        }
    }
}
