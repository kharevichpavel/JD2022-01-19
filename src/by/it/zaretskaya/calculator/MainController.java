package by.it.zaretskaya.calculator;

import by.it.zaretskaya.calculator.exeptions.CalcException;
import by.it.zaretskaya.calculator.model.Var;
import by.it.zaretskaya.calculator.service.CalcService;

public class MainController {
    private final CalcService calcService;

    public MainController(CalcService calcService) {
        this.calcService = calcService;
    }

    Object evaluate(String request){
        try{
            Var result= calcService.calc(request);
            return  result;
        }
        catch (CalcException e){
            return e;
        }
    }
}
