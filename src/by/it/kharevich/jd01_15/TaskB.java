package by.it.kharevich.jd01_15;

import by.it.kharevich.jd01_14.PathFinder;

import java.io.*;

/**
 * Hello world!!!
 */

public class TaskB {

    public static final String ROOT = "src";
    public static final String FILENAME_JAVA = "TaskB.java";
    public static final String FILENAME_TXT = "TaskB.txt";

    public static void main(String[] args) {

        String filenameJava = PathFinder.getFilename(TaskB.class, ROOT, FILENAME_JAVA);
        String filenameTxt = PathFinder.getFilename(TaskB.class, ROOT, FILENAME_TXT); //error
        String contentFromFileJava = readJavaFileAndDeleteComments(filenameJava);
        writeContentToConsole(contentFromFileJava);
        writeContentToTxtFile(contentFromFileJava, filenameTxt);

       /*google
        google
        google
         */
    }

    private static void writeContentToConsole(String javaFileContent) {
        System.out.println(javaFileContent); // Hello world!!!
        System.out.println();
    }

    private static void writeContentToTxtFile(String javaFileContent, String filename) {
        try (PrintWriter printWriter = new PrintWriter(filename)) {
            printWriter.printf("%s%n", javaFileContent);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("IO ERROR", e);
        }
    }
    /*Hello world!!!
                 How are you?*/

    private static String readJavaFileAndDeleteComments(String filenameJava) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filenameJava)))) {
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                stringBuilder.append(text);
                stringBuilder.append("\n");
                int posStart = 0;
                int posEnd;
                boolean flag = false;
                for (int i = 0; i < stringBuilder.length() - 1; i++) {
                    if (stringBuilder.charAt(i) == '/' && stringBuilder.charAt(i + 1) == '*') {
                        posStart = i;
                    }
                    if (stringBuilder.charAt(i) == '*' && stringBuilder.charAt(i + 1) == '/') {
                        posEnd = i++ + 2;
                        stringBuilder.delete(posStart, posEnd);
                    }
                }
                for (int j = 0; j < stringBuilder.length() - 1; j++) {
                    if (stringBuilder.charAt(j) == '/' && stringBuilder.charAt(j + 1) == '/') {
                        posStart = j;
                        flag = true;
                    }
                    if (stringBuilder.charAt(j) == '\n' && flag) {
                        posEnd = j++;
                        stringBuilder.delete(posStart, posEnd);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("IO ERROR", e);
        }
        return stringBuilder.toString();
    }
}
