package by.it.kharevich.calculator;

public class ConsoleRunner {

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        VarReposito varReposito = new VarReposito();
        Parser parser = new Parser(varReposito);
        Application application = new Application(printer, parser);
        application.run();

    }
}
