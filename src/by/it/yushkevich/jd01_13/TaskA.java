package by.it.yushkevich.jd01_13;

import java.util.HashMap;

public class TaskA {

    public static void main(String[] args) {

        try {
            if (Math.random()>0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        } catch (NumberFormatException | NullPointerException e) {
            //e.printStackTrace();
            printOutInfo(e);
        }
    }

    private static void printOutInfo(RuntimeException e) {

        Class<? extends RuntimeException> eClass = e.getClass();
        String eName = eClass.getName();
       // System.out.println(eNam);
        Class<TaskA> aClass = TaskA.class;
        String aClassName = aClass.getName();
        //System.out.println(aClassName);

        StackTraceElement[] traceElements = e.getStackTrace();
        for (StackTraceElement element : traceElements) {
            String elementClassName = element.getClassName();
            if (aClassName.equals(elementClassName)){
                int lineNumber = element.getLineNumber();

                System.out.printf(
                        " name: %sn\n" +
                        "class: %s\n" +
                        " line: %d\n",
                        eName, elementClassName, lineNumber);


                break;


            }
        }


    }
}
