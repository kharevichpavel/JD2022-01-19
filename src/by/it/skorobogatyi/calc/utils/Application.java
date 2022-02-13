package by.it.skorobogatyi.calc.utils;

import by.it.skorobogatyi.calc.printers.Printer;
import by.it.skorobogatyi.calc.variables.Var;

import java.util.Scanner;

public class Application {

    public static final String END = "end";
    private final Printer printer;
    private final Parser parser;

    public Application(Printer printer, Parser parser) {
        this.printer = printer;
        this.parser = parser;
    }

    public void run() {

        System.out.println("Application started");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();

            if (!line.equals(END)) {
                Var result = parser.calc(line);
                printer.print(result);
            } else {
                System.out.println("App finished");
                break;
            }
        }
    }
}
