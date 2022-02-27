package by.it.skorobogatyi.jd01_15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;
import java.util.Scanner;

import static by.it._classwork_.jd01_14.PathFinder.DOT;
import static java.io.File.separator;

public class TaskC {

    public static final String ROOT = "src";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String directoryName = getStartDirectoryName();

        while (true) {

            File file = new File(directoryName);
            System.out.println(directoryName);

            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;

            } else if (command.equals("dir")) {
                printDirectoryContents(Objects.requireNonNull(file.listFiles()));

            } else if (command.equals("cd..") || command.equals("cd ..")) {
                directoryName = directoryName.substring(0, directoryName.lastIndexOf(separator));

                if (directoryName.length() == 2) {
                    directoryName += separator;
                }

            } else if (command.contains("cd ")) {
                directoryName = directoryName + separator + command.substring(3) + separator;
            }
        }
    }

    private static String getStartDirectoryName() {

        String userDir = System.getProperty("user.dir");
        String returnString = ROOT + separator +
                TaskC.class.getPackageName().replace(DOT, separator);
        return userDir + separator + returnString;
    }


    private static void printDirectoryContents(File[] files) {

        for (File file : files) {
            String fileName = file.getName();
            try {
                System.out.printf("%-30s  %-6s  %10d  %s%n",
                        Files.getLastModifiedTime(file.toPath()),
                        (Files.isDirectory(file.toPath())) ? "<DIR>" : "<FILE>",
                        Files.size(file.toPath()),
                        fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
