package by.it.burov.calc;

public class ConsoleRunner {

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        Parcer parcer = new Parcer();
        Application application = new Application(printer,parcer);
        application.run();
    }
}