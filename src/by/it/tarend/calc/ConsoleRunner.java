package by.it.tarend.calc;

public class ConsoleRunner {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        VarRepository varRepository = new VarRepository();
        Parser parser = new Parser(varRepository);
        Reader reader = new Reader();
        Application application = new Application(printer, parser, reader);
        application.run();
    }
}
