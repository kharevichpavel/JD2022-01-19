package by.it.zaretskaya.jd01_09;

public class ConsoleRunner {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        Parser parser = new Parser();
        Application application = new Application(printer,parser);
        application.run();
    }
}
