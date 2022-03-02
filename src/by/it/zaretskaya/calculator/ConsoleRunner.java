package by.it.zaretskaya.calculator;

import by.it.zaretskaya.calculator.controllers.MainController;
import by.it.zaretskaya.calculator.repositories.MapRepository;
import by.it.zaretskaya.calculator.repositories.VarRepository;
import by.it.zaretskaya.calculator.service.CalcService;
import by.it.zaretskaya.calculator.view.ConsolePrinter;
import by.it.zaretskaya.calculator.view.Printer;

public class ConsoleRunner {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        VarRepository repository =new MapRepository();
        CalcService calcService = new CalcService(repository);
        MainController mainController = new MainController(calcService);
        Application application = new Application(printer, calcService,mainController );
        application.run();
    }
}
