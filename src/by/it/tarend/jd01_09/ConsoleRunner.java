package by.it.tarend.jd01_09;

public class ConsoleRunner {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        Parser parser = new Parser();
        Reader reader = new Reader();
        Application application = new Application(printer, parser, reader);
        application.run();
    }
}
