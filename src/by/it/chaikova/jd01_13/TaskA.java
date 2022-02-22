package by.it.chaikova.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        } catch (NullPointerException | NumberFormatException e) {
            Class<? extends RuntimeException> eClass = e.getClass();
            String eClassName = eClass.getName();

            Class<TaskA> taskAClass = TaskA.class;
            String taskAClassName = taskAClass.getName();
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                if (taskAClassName.equals(className)) {
                    int lineNumber = stackTraceElement.getLineNumber();
                    System.out.printf(
                            " name: %s\n" +
                                    "class: %sn\n" +
                                    " line: %d\n", eClassName, className, lineNumber);
                    break;
                }
            }

        }
    }
}
