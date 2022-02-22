package by.it.skorobogatyi.jd01_13;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        while (scanner.hasNext()) {
            String next = scanner.next();

            if (! next.equals("END")) {
                try {
                    double input = Double.parseDouble(next);
                    sum += input;
                    double sqrt = Math.sqrt(sum);
                    if (Double.isNaN(sqrt)) {
                        throw new ArithmeticException();
                    } else {
                        System.out.println(sqrt);
                    }
                } catch (NumberFormatException | ArithmeticException exception) {
                    printException(exception);
                    break;
                }
            } else {
                break;
            }
        }
    }

    public static void printException(RuntimeException e) {

        Class<? extends RuntimeException> aClass = e.getClass();
        String exceptionName = aClass.getName(); //name

        Class<TaskB> taskBClass = TaskB.class;
        String taskAClassName = taskBClass.getName(); //reference class for comparison
        StackTraceElement[] stackTrace = e.getStackTrace();

        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName(); //class

            if (taskAClassName.equals(className)) { //comparison
                int lineNumber = stackTraceElement.getLineNumber(); //line
                System.out.printf(" name: %s%n" +
                        "class: %s%n" +
                        " line: %d%n", exceptionName, className, lineNumber);
                break;
            }
        }
    }
}
