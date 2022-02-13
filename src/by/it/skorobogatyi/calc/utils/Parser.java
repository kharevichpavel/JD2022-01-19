package by.it.skorobogatyi.calc.utils;

import by.it.skorobogatyi.calc.variables.Var;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public Var calc(String expression) {

        expression = expression.replaceAll(CustomPatterns.SPACES, "");
        String[] parts = expression.split(CustomPatterns.OPERATION, 2);

        if (parts.length == 1) {
            return Var.create(expression);
        }

        Var left = Var.create(parts[0]);
        Var right = Var.create(parts[1]);

        if (left != null && right != null) {
            Matcher matcher = Pattern.compile(CustomPatterns.OPERATION).matcher(expression);

            if (matcher.find()) {
                String operation = matcher.group();
                switch (operation) {
                    case "+": return left.add(right);
                    case "-": return left.sub(right);
                    case "*": return left.mul(right);
                    case "/": return left.div(right);
                    default: System.out.println("Incorrect expression: " + expression);
                }
            }
        }
        System.out.println("Incorrect expression: " + expression);
        return null;
    }
}
