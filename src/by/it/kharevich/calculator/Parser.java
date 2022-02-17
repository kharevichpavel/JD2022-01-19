package by.it.kharevich.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private VarReposito varReposito;

    public Parser(VarReposito varReposito) {
        this.varReposito = varReposito;
    }


    public Var calc(String expression) throws CalcException {
        expression = expression.replaceAll(Patterns.SPACES, "");
        String[] parts = expression.split(Patterns.OPERATION, 2);
        if (parts.length == 1) {
            return varReposito.create(expression);
        }
        Var right = varReposito.create(parts[1]);
        if (expression.contains("=")) {
            String name = parts[0];
            return varReposito.save(name, right);
        }
        Var left = varReposito.create(parts[0]);
        if (left == null || right == null) {
            String message = "Incorrect expression " + expression;
            throw new CalcException(message);
        }
        Matcher matcher = Pattern.compile(Patterns.OPERATION).matcher(expression);
        if (matcher.find()) {
            String operation = matcher.group();
            switch (operation) {
                case "+":
                    return left.add(right);
                case "-":
                    return left.sub(right);
                case "*":
                    return left.mul(right);
                case "/":
                    return left.div(right);
            }
        }
        return null;
    }
}
