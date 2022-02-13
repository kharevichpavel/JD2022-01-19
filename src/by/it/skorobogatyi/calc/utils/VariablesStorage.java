package by.it.skorobogatyi.calc.utils;

import by.it.skorobogatyi.calc.variables.AbstractVar;

import java.util.*;

public class VariablesStorage {

    public static HashMap<String, AbstractVar> variables = new HashMap<>();

    public static String printVar() {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Map.Entry<String, AbstractVar>> entrySet = variables.entrySet();
        Object[] toArray = entrySet.toArray();
        for (Object o : toArray) {
            stringBuilder.append(o.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public static String sortVar() {
        StringBuilder stringBuilder = new StringBuilder();
        SortedMap<String, AbstractVar> sortedMap = new TreeMap<>(variables);
        return null;
    }
}
