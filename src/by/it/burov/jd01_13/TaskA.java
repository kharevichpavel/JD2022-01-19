package by.it.burov.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        }catch (NumberFormatException | NullPointerException e){
            Class<? extends RuntimeException> eClass = e.getClass();
            String name = eClass.getName();
            Class<TaskA> taskAClass = TaskA.class;
            String nameMain = taskAClass.getName();
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                if (className.equals(nameMain)) {
                    int lineNumber = stackTraceElement.getLineNumber();
                    System.out.printf("name: %s%n" +
                    "class: %s%n" +
                    "line: %s%n", name,className,lineNumber);
                    break;
                }
            }
        }
    }
}
