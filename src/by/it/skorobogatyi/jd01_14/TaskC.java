package by.it.skorobogatyi.jd01_14;

import java.io.*;

import static by.it._classwork_.jd01_14.PathFinder.DOT;
import static java.io.File.separator;

public class TaskC {

    private static final String ROOT = "src";
    private static final String OUTPUT_FILE = "resultTaskC.txt";

    public static void main(String[] args) {

        String directoryName = getDirectoryName();

        File file = new File(directoryName);

        File[] files = file.listFiles();

        printDirectoryContents(files, System.out);

        String outputFileName = FilenameGetter.getFilename(TaskC.class, ROOT, OUTPUT_FILE);

        try(
                PrintWriter stringWriter = new PrintWriter(outputFileName)
        ) {
            printDirectoryContents(files, stringWriter);
        } catch (IOException e) {
            throw new RuntimeException("ERROR:", e);
        } ;

    }

    private static void printDirectoryContents(File[] files, PrintStream out) {

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();

            if (files[i].isFile()) {
                out.printf("file:%s%n", fileName);

            } else {
                out.printf("dir:%s%n", fileName);

                printDirectoryContents(files[i].listFiles(), out);
            }
        }
    }

    private static void printDirectoryContents(File[] files, PrintWriter out) {

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();

            if (files[i].isFile()) {
                out.printf("file:%s%n", fileName);

            } else {
                out.printf("dir:%s%n", fileName);

                printDirectoryContents(files[i].listFiles(), out);
            }
        }
    }

    private static String getDirectoryName() {

        String userDir = System.getProperty("user.dir");
        String returnString = ROOT + separator + TaskC.class.getPackageName().replace(DOT, separator).replace("\\jd01_14", "");
        return userDir + separator + returnString;
    }
}
