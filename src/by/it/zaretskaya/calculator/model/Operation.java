package by.it.zaretskaya.calculator.model;

import by.it.zaretskaya.calculator.CalcException;
import by.it.zaretskaya.calculator.model.Var;

interface Operation {
    Var add(Var other) throws CalcException;

    Var sub(Var other) throws CalcException;

    Var mul(Var other) throws CalcException;

    Var div(Var other) throws CalcException;
}