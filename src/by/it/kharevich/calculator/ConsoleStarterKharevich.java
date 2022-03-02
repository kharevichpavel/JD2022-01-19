package by.it.kharevich.calculator;

import by.it.kharevich.calculator.controllers.MainController;
import by.it.kharevich.calculator.repository.FileRepository;
import by.it.kharevich.calculator.repository.VarRepository;
import by.it.kharevich.calculator.services.CalcService;
import by.it.kharevich.calculator.utils.PathFinder;
import by.it.kharevich.calculator.view.ConsolePrinter;
import by.it.kharevich.calculator.view.Printer;

public class ConsoleStarterKharevich {

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        String filename = PathFinder.getFilename(Application.class, "src", "vars.txt");
        VarRepository repository = new FileRepository(filename); //меняем репозитарий
        CalcService calcService = new CalcService(repository);
        MainController mainController = new MainController(calcService);
        Application application = new Application(printer, calcService, mainController);
        application.run();

    }
}
