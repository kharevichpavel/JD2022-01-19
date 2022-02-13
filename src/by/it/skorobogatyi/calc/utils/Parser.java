package by.it.skorobogatyi.calc.utils;

import by.it.skorobogatyi.calc.variables.AbstractVar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public AbstractVar calc(String expression) {

        expression = expression.replaceAll(CustomPatterns.SPACES, "");
        String[] parts = expression.split(CustomPatterns.OPERATION, 2);

        if (parts.length == 1) {
            return AbstractVar.create(expression);
        }

        AbstractVar left = AbstractVar.create(parts[0]);
        AbstractVar right = AbstractVar.create(parts[1]);

        if (left != null && right != null) {
            Matcher matcher = Pattern.compile(CustomPatterns.OPERATION).matcher(expression);

            if (matcher.find()) {
                String operation = matcher.group();
                switch (operation) {
                    case "+": return left.add(right);
                    case "-": return left.sub(right);
                    case "*": return left.mul(right);
                    case "/": return left.div(right);
                    case "=":
                        VariablesStorage.variables.put(String.valueOf(left), right);
                        break;
                    default: System.out.println("Incorrect expression: " + expression);
                }
            }
        }
        return null;
    }
}
