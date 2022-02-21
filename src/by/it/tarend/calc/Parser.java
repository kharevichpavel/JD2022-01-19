package by.it.tarend.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    // 2+2 {1, 2, 3}+{1,1,1}  {{1,1,1},{2,2,2}} + {{1,1,1}, {3,3,3}}

    final private VarRepository varRepository;

    public Parser(VarRepository varRepository) {
        this.varRepository = varRepository;
    }

    public Var calc(String expression) throws CalcException {
        expression = expression.replaceAll(Patterns.SPACES, "");
        String[] parts = expression.split(Patterns.OPERATION, 2);
        if (parts.length == 1) {
            return varRepository.create(expression); // TODO вынести в отдельный класс
        }

        Var right = varRepository.create(parts[1]);
        if (expression.contains("=")) {
            String name = parts[0];
            return varRepository.save(name, right);
        }
        Var left = varRepository.create(parts[0]);
        if (left == null || right == null) {
            throw new CalcException("Incorrect expression " + expression);
        }

        Matcher matcher = Pattern.compile(Patterns.OPERATION).matcher(expression);
        if (matcher.find()) {
            String operation = matcher.group();
            switch (operation) {
                case "+": return left.add(right);
                case "-": return left.sub(right);
                case "*": return left.mul(right);
                case "/": return left.div(right);
            }
        }
        throw new CalcException("???");
    }
}
