package by.it.skorobogatyi.jd01_13;

import java.util.HashMap;

public class TaskA {

    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");

        } catch (NullPointerException | NumberFormatException e) {
            printException(e);
        }
    }

    public static void printException(RuntimeException e) {

        Class<? extends RuntimeException> aClass = e.getClass();
        String exceptionName = aClass.getName(); //name

        Class<TaskA> taskAClass = TaskA.class;
        String taskAClassName = taskAClass.getName(); //reference class for comparison
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
