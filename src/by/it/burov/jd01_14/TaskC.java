package by.it.burov.jd01_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class TaskC {

    private static final String ROOT = "src";
    private static final String TXT = "resultTaskC.txt";

    public static void main(String[] args) throws IOException {
        String path = PathFinder.getFilename(TaskC.class, ROOT);
        File tempFile = new File(path);
        File file = new File(tempFile.getParent());
        String outFile = PathFinder.getFilename(TaskC.class, ROOT, TXT);
        outToConsoleAndTxt(file, outFile);
    }

    private static void outToConsoleAndTxt(File file, String outFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            for (File f : Objects.requireNonNull(file.listFiles())) {
                if (f.isDirectory()) {
                    System.out.printf("dir:%s%n", f.getName());
                    writer.write( String.format("dir:%s%n", f.getName()));
                    for (File f2 : Objects.requireNonNull(f.listFiles())) {
                        if (f2.isDirectory()) {
                            System.out.printf("dir:%s%n", f2.getName());
                            writer.write( String.format("dir:%s%n", f2.getName()));
                        } else {
                            System.out.printf("file:%s%n", f2.getName());
                            writer.write( String.format("file:%s%n", f2.getName()));
                        }
                    }
                } else {
                    System.out.printf("file:%s%n", f.getName());
                    writer.write( String.format("file:%s%n", f.getName()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
