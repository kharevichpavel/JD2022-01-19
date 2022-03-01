package by.it.kustova.jd01_15;

import by.it.kustova.jd01_14.PathFinder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TaskB {
    public static final String ROOT = "src";
    public static final String TASK_B_JAVA = "TaskB.java";
    public static final String TASK_B_TXT = "TaskB.txt";

    //oneLine comment

    /* additional
    comment
     */


    /**
     * метод main() точка входа
     */

    public static void main(String[] args) {

        String filename = PathFinder.getFilename(TaskB.class, ROOT, TASK_B_JAVA);
        String filename1 = PathFinder.getFilename(TaskB.class, ROOT, TASK_B_TXT);
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String text;
            while ((text = reader.readLine()) != null) {
                stringBuilder.append(text + "\n");
            }
            int start = 0;
            int end;
            boolean x = false;
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) == '/' && stringBuilder.charAt(i + 1) == '*') {
                    start = i;
                } else if (stringBuilder.charAt(i) == '*' && stringBuilder.charAt(i + 1) == '/') {
                    end = i++ + 2;
                    stringBuilder.replace(start, end, " ");
                }
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



