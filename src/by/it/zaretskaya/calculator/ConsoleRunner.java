package by.it.zaretskaya.calculator;

import by.it.zaretskaya.calculator.service.CalcService;

public class ConsoleRunner {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        VarRepository varRepository=new VarRepository();
        CalcService calcService = new CalcService(varRepository);
        Application application = new Application(printer, calcService);
        application.run();
    }
}
