package by.it.kuzma.jd01_09;

import java.util.Scanner;

public class Application {

    public static final String END = "end";
    private final  Printer printer;
    private final Parser parcer;


    public Application(Printer printer, Parser parcer) {
        this.printer = printer;
        this.parcer = parcer;
    }

    public void run() {

        System.out.println("App started");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            if (!line.equals(END)) {
                Var result=parcer.calc(line);
                printer.print(result);
            } else {
                System.out.println("App finished");
                break;
            }
        }
    }
}
