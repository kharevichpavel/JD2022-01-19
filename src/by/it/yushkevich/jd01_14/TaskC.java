package by.it.yushkevich.jd01_14;

import java.io.File;

public class TaskC {

    public static final String ROOT = "src";
    public static final String DOT = ".";
    public static final String USER_DIR = "user.dir";
    public static final String SEPARATOR = File.separator;


    public static void main(String[] args) {

        getNameFile(TaskC.class);


    }

    private static String getNameFile(Class<TaskC> cClass) {
        String fileNameDir = System.getProperty(USER_DIR);


        String fileNameDirFull = fileNameDir + File.separator + ROOT;
        String className = cClass.getName();
        String classSimpleName = cClass.getSimpleName();
        String classPackName = cClass.getPackageName();



        System.out.println(fileNameDir);
        System.out.println(fileNameDirFull);
        System.out.println(".".repeat(100));
        System.out.println("ClassName = "+className);
        System.out.println("Simple name  = "+classSimpleName);
        System.out.println("Pack Name = "+classPackName);

        String fileName = fileNameDir + SEPARATOR + ROOT + SEPARATOR + classPackName.replace(".","\\");
        File file = new File(fileName);
        String parent = file.getParent();
        File file1 = new File(parent);
        if (file1.isDirectory()){
            System.out.println(file1.getName());
        }
        File[] files = file1.listFiles();
        for (File fileInArray : files) {
            String[] listOfDirectories = fileInArray.list();
            System.out.println("Dir  ---->"+ fileInArray.getName());
            for (String directory : listOfDirectories) {

                System.out.println("  File Name---->"+ directory);
            }

        }

        System.out.println("-".repeat(100));
        System.out.println(fileName);
        System.out.println(parent);

        return null;
    }


}
