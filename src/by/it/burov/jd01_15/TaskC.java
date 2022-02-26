package by.it.burov.jd01_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class TaskC {
    public static void main(String[] args) {
        String inputFilename = PathFinder.getFilename(TaskC.class, "src");
        File tempFile = new File(inputFilename);
        File file = new File(tempFile.getParent());
        String command;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                command = reader.readLine();
                if (command.equals("cd")) {
                    file = file.getParentFile();
                } else if (command.equals("dir")) {
                    openFile(file);
                } else if (command.equals("end")) {
                    break;
                }
                System.out.println(file.getPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void openFile(File file) {
        for (File f : Objects.requireNonNull(file.listFiles())) {
            if (f.isDirectory()) {
                System.out.printf("dir:%s%n", f.getName());
                for (File f2 : Objects.requireNonNull(f.listFiles())) {
                    if (f2.isDirectory()) {
                        System.out.printf("dir:%s%n", f2.getName());
                    } else {
                        System.out.printf("file:%s%n", f2.getName());
                    }
                }
            } else {
                System.out.printf("file:%s%n", f.getName());
            }
        }
    }
}
