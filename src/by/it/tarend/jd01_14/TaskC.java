package by.it.tarend.jd01_14;

import java.io.File;

public class TaskC {

    public static final String ROOT = "src";
    public static final String FILENAME_TO_WRITE = "resultTaskC.txt";

    public static void main(String[] args) {

        String pathToClass = PathFinder.getFileName(TaskC.class, ROOT, TaskC.class.getSimpleName()).replaceAll(File.separator+TaskC.class.getSimpleName(), "");

        String pathToSurname = getSurnameDirectory(pathToClass);

        File surnameDirectory = new File(pathToSurname);

        String listOfAll = getListOfAll(pathToSurname, surnameDirectory); // нужно запилить рекурсию для большего уровня вложений, а то говнокод(

        String txtFileName = PathFinder.getFileName(TaskC.class, ROOT, FILENAME_TO_WRITE);
        TaskB.outputToTxtFile(listOfAll, txtFileName);
        System.out.println(listOfAll);

    }

    @SuppressWarnings("ConstantConditions")
    private static String getListOfAll(String pathToSurname, File surnameDirectory) {
        String[] listOfSurnameDirectory = surnameDirectory.list();
        StringBuilder listOfAll = new StringBuilder("");
        for (String s : listOfSurnameDirectory) {
            File subDirectory = new File(pathToSurname + File.separator + s);
            if (subDirectory.isDirectory()) {
                listOfAll.append("dir:").append(s).append("\n");
                String[] listOfSubDirectory = subDirectory.list();
                for (String file : listOfSubDirectory) {
                    listOfAll.append("file:").append(file).append("\n");
                }
            } else {
                listOfAll.append("file:").append(s).append("\n");
            }
        }
        return listOfAll.toString();
    }

    private static String getSurnameDirectory(String pathToClass) {
        File file = new File(pathToClass);
        String parent = file.getParent();
        System.out.println(parent);
        return parent;
    }
}
