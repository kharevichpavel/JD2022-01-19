package by.it._classwork_.calculator.repositories;

import by.it._classwork_.calculator.model.Var;

public interface VarRepository {
    Var save(String name, Var value);
    Var create(String varValueOrName);
}
