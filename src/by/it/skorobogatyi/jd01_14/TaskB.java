package by.it.skorobogatyi.jd01_14;

import java.io.FileReader;
import java.io.IOException;

import static java.io.File.separator;

public class TaskB {

    private static final String DOT = ".";
    private static final String ROOT = "src";
    private static final String TXT_NAME = "resultTaskB.txt";


    public static void main(String[] args) {

        String txtFileName = getFilename(TaskB.class, ROOT, TXT_NAME);
        try (FileReader fileReader = new FileReader(txtFileName)) {

        } catch (IOException e) {
            throw new RuntimeException("ERROR: " + e);
        }
    }

    public static String getFilename(Class<?> aClass, String root, String filename) {
        String userDir = System.getProperty("user.dir");
        String fullRootDir = userDir + separator + root + separator;
        String returnString = aClass.getPackageName().replace(DOT, separator);
        filename = returnString + separator + filename;
        return fullRootDir + filename;
    }

}
