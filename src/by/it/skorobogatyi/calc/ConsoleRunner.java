package by.it.skorobogatyi.calc;


import by.it.skorobogatyi.calc.printers.ConsolePrinter;
import by.it.skorobogatyi.calc.printers.Printer;
import by.it.skorobogatyi.calc.utils.Application;
import by.it.skorobogatyi.calc.utils.Parser;

public class ConsoleRunner {

    public static void main(String[] args) {

        Printer printer = new ConsolePrinter();
        Parser parser = new Parser();

        Application application = new Application(printer, parser);
        application.run();
    }
}
