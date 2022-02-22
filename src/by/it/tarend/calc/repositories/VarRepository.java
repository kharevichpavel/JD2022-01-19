package by.it.tarend.calc.repositories;

import by.it.tarend.calc.model.Var;

public interface VarRepository {

    Var save(String name, Var value);

    Var create(String varValueOrName);

}
