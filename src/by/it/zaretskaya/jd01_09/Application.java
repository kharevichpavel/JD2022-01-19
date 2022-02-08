package by.it.zaretskaya.jd01_09;

import java.util.Scanner;

import static by.it._classwork_.jd01_09.Application.END;

public class Application {
    private final Printer printer;
    private final Parser parcer;

    public Application(Printer printer, Parser parcer) {
        this.printer = printer;
        this.parcer = parcer;
    }

    public void run() {
        System.out.println("App started");
        Scanner scanner = new Scanner (System.in);
        while (true){
            String line = scanner.nextLine();
            if (line.equals(END)) {
                Var result=parcer.calc(line);
                printer.print (result);
            }else{
                System.out.println("App finished");
                break;
            }
        }

    }
}
