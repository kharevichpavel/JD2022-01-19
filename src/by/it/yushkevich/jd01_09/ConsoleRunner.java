package by.it.yushkevich.jd01_09;

public class ConsoleRunner {
    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        Parser parcer = new Parser();
        Application application = new Application(printer, parcer);

        application.run();
    }
}
