package by.it.tarend.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if (Math.random()>0.5) {
                new HashMap<String, String>(null);
            } else {
                Integer.parseInt("привет");
            }

        } catch (NullPointerException | NumberFormatException e) {
            printExeptionDescription(e);
        }
    }

    private static void printExeptionDescription(RuntimeException e) {
        String eClassName = e.getClass().getName();
        System.out.println(" name: " + eClassName);
        String className = TaskA.class.getName();
        System.out.println("class: " + className);
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (className.equals(stackTraceElement.getClassName())) {
                int lineNumber = stackTraceElement.getLineNumber();
                System.out.println(" line: " + lineNumber);
                break;
            }
        }
    }
}
