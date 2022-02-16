package by.it.yushkevich.jd01_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {

        inputText();

    }


    private static void inputText() {

        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        double sum = 0;
        try {
            while (true) {

                String text = scanner.nextLine();
                if (text.equals("END")) {
                    break;
                } else {
                    Double num = Double.parseDouble(text);
                    sum = sum+num;
                    if (sum<0){
                        throw new ArithmeticException();
                    }
                    list.add(num);
                    System.out.println(num +" "+ sum+ " " +Math.sqrt(sum));
                }

            }
        } catch (NumberFormatException e) {
            printOutInfo(e);
        }

    }


    private static void printOutInfo(RuntimeException e) {

        Class<? extends RuntimeException> eClass = e.getClass();
        String eName = eClass.getName();
        // System.out.println(eNam);
        Class<TaskB> bClass = TaskB.class;
        String aClassName = bClass.getName();
        //System.out.println(aClassName);

        StackTraceElement[] traceElements = e.getStackTrace();
        for (StackTraceElement element : traceElements) {
            String elementClassName = element.getClassName();
            if (aClassName.equals(elementClassName)) {
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
