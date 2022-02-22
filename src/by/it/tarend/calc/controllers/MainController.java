package by.it.tarend.calc.controllers;

import by.it.tarend.calc.exceptions.ApplicationException;
import by.it.tarend.calc.exceptions.CalcException;
import by.it.tarend.calc.model.Var;
import by.it.tarend.calc.services.CalcService;

public class MainController {

    private final CalcService calcService;

    public MainController(CalcService calcService) {
        this.calcService = calcService;
    }

    public Var process(String request) {
        try {
            return calcService.calc(request);

        } catch (CalcException e) {
            throw new ApplicationException(e);
        }
    }
}

