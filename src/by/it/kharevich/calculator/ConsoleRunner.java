package by.it.kharevich.calculator;

public class ConsoleRunner {

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        Parser parser = new Parser();
        Application application = new Application(printer, parser);
        application.run();

    }
}
