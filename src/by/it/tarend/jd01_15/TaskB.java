package by.it.tarend.jd01_15;

import by.it.tarend.calc.utils.PathFinder;

import java.io.*;

// comment
public class TaskB {
    /*
    comment
    comment
    */
    public static final String ROOT = "src";
    public static final String FILENAME_TO_WRITE = "TaskB.txt";
    public static final String FILENAME_TO_READ = "TaskB.java";
    public static final char SLASH = '/';
    public static final char STAR = '*';

    public static void main(String[] args) {

    // comment
        String fileNameToRead = PathFinder.getFileName(TaskB.class, ROOT, FILENAME_TO_READ);
        StringBuilder textFromFile = readFileToString(fileNameToRead);
        System.out.println(textFromFile);

        String txtFileNameToWrite = PathFinder.getFileName(TaskB.class, ROOT, FILENAME_TO_WRITE);
        outputToTxtFile(textFromFile.toString(), txtFileNameToWrite);
    /**
    * 123
    * 321
    */
        System.out.println(textFromFile);
    }

    private static StringBuilder readFileToString(String fileNameToRead) {
        StringBuilder textFromFile = new StringBuilder();
    /*
    comment
    comment
    */
        try (RandomAccessFile file = new RandomAccessFile(new File(fileNameToRead), "r")) {
            while (file.getFilePointer() < file.length()) {
                textFromFile.append(file.readLine()).append('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException("IO error", e);
        }
        return textFromFile;
    }

    public static void outputToTxtFile(String output, String txtFileName) {
        try (PrintWriter printWriter = new PrintWriter(txtFileName)) {
            printWriter.print(output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("IO error", e);
        }
    }
}




