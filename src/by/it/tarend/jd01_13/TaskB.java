package by.it.tarend.jd01_13;

import java.util.Scanner;

import static java.lang.Double.isNaN;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (true) {
            String stringLine = sc.nextLine();
            if (!stringLine.equals("END")) {
                try {
                    double number = Double.parseDouble(stringLine);
                    System.out.print(number + "  ");
                    sum += number;
                    double sqrt = Math.sqrt(sum);
                    if (!isNaN(sqrt)) {
                        System.out.println(sqrt);
                    } else {
                        System.out.println();
                        throw new ArithmeticException();
                    }
                } catch (NumberFormatException | ArithmeticException e) {
                    printExceptionDescription(e);
                }
            } else {
                break;
            }
        }
    }
    private static void printExceptionDescription(RuntimeException e) {
        String eClassName = e.getClass().getName();
        String className = TaskB.class.getName();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (className.equals(stackTraceElement.getClassName())) {
                int lineNumber = stackTraceElement.getLineNumber();
                System.out.println(" name: " + eClassName);
                System.out.println("class: " + className);
                System.out.println(" line: " + lineNumber);
                break;
            }
        }
    }
}
