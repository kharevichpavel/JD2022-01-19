package by.it.skorobogatyi.jd01_15;

import java.util.Scanner;

import static by.it._classwork_.jd01_14.PathFinder.DOT;
import static java.io.File.separator;

public class TaskC {

    public static final String ROOT = "src";
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("hello there");

        String directoryName = getDirectoryName();
        System.out.println(directoryName);

        String command = scanner.nextLine();
        while (true) {

            if (command.equals("end")) {

                System.out.println("turning off...");
                break;
            } else {
                if (command.equals("cd ..")) {
                }
            }
        }


    }

    private static String getDirectoryName() {

        String userDir = System.getProperty("user.dir");
        String returnString = ROOT + separator +
                TaskC.class.getPackageName().replace(DOT, separator);
        return userDir + separator + returnString;
    }

}
