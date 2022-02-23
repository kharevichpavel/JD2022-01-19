package by.it.tarend.jd01_15;

import by.it.tarend.calc.utils.PathFinder;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TaskB {


    // comment
    public static final char NEW_LINE = '\n';
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

        String fileNameToRead = PathFinder.getFileName(TaskB.class, ROOT, FILENAME_TO_READ);
        File fileToRead = new File(fileNameToRead);

        StringBuilder textFromFile = new StringBuilder();

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileToRead, "r")){
            long filePointer = randomAccessFile.getFilePointer();
            /*            while (filePointer < randomAccessFile.length()) {*/
            int symbol = 0;
            while ((symbol = randomAccessFile.read()) != (int) SLASH) {
                textFromFile.append((char) symbol);
            }
            if (randomAccessFile.read() == (int) SLASH) {
                while (randomAccessFile.read() != (int) NEW_LINE) {
                }
                textFromFile.append('\n');
            } else if (randomAccessFile.read() == (int) STAR) {
                randomAccessFile.skipBytes(20);
            }
            for (int i = 0; i < 200; i++) {
                textFromFile.append((char) randomAccessFile.read());
            }
            filePointer = randomAccessFile.getFilePointer();
            //}
        } catch (IOException e) {
            throw new RuntimeException("IO error", e);
        }

        System.out.println(textFromFile);

        /*
        comment
        comment
         */

        /**
         * 123
         * 321
         */

        // comment
    }
}




