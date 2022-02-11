package by.it.skorobogatyi.jd01_09;


import by.it.skorobogatyi.jd01_09.utils.Parser;
import by.it.skorobogatyi.jd01_09.printers.ConsolePrinter;
import by.it.skorobogatyi.jd01_09.printers.Printer;
import by.it.skorobogatyi.jd01_09.utils.Application;

public class ConsoleRunner {

    public static void main(String[] args) {

        Printer printer = new ConsolePrinter();
        Parser parser = new Parser();

        Application application = new Application(printer, parser);
        application.run();
    }
}
