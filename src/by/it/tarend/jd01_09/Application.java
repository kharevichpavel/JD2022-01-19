package by.it.tarend.jd01_09;

import java.util.Scanner;

public class  Application {

    public static final String END = "end";
    private final Printer printer;
    private final Parser parser;
    private final Reader reader;

    public Application(Printer printer, Parser parser, Reader reader) {
        this.printer = printer;
        this.parser = parser;
        this.reader = reader;
    }


    public void run() {
        System.out.println("App start");
        Scanner sc = new Scanner(System.in);
        while (true){
            String line = sc.nextLine();
            if (!line.equals(END)) {
            Var result= parser.calc(line);
                printer.print(result);
            } else {
                System.out.println("App finished");
                break;
            }
/*        while (true) {
            String command = reader.readFromConsole();
            if (!command.equals(END)) {
                Var result = parser.calc(command);
                printer.print(result);
            } else {
                System.out.println("App finished");
                break;
            }
*/        }
    }
}
