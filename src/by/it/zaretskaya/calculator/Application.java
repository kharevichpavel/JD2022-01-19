package by.it.zaretskaya.calculator;

import by.it.zaretskaya.calculator.exeptions.CalcException;
import by.it.zaretskaya.calculator.model.Var;
import by.it.zaretskaya.calculator.service.CalcService;

import java.util.Scanner;

public class Application {

    public static final String END="end";
    private final Printer printer;
    private final CalcService calcService;

    public Application(Printer printer, CalcService calcService) {
        this.printer = printer;
        this.calcService = calcService;
    }

    public void run() {
        System.out.println("App started");
        Scanner scanner = new Scanner (System.in);
        while (true){
            String line = scanner.nextLine();
            if (!line.equals(END)) {
                try{
                    Var result= calcService.calc(line);
                printer.print (result);
                }
                catch (CalcException e){
                printer.print(e);
                }
            }else{
                System.out.println("App finished");
                break;
            }
        }

    }
}
