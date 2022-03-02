package by.it.tarend.jd01_14;

import java.io.File;

public class TaskC {

    public static final String ROOT = "src";
    public static final String FILENAME_TO_WRITE = "resultTaskC.txt";

    public static void main(String[] args) {

        String pathToClass = PathFinder.getFileName(TaskC.class, ROOT, TaskC.class.getSimpleName()).replace(File.separator+TaskC.class.getSimpleName(), "");

        String pathToSurname = getSurnameDirectory(pathToClass);

        File surnameDirectory = new File(pathToSurname);

        String listOfAll = getListOfAll(pathToSurname, surnameDirectory);

        String txtFileName = PathFinder.getFileName(TaskC.class, ROOT, FILENAME_TO_WRITE);
        TaskB.outputToTxtFile(listOfAll, txtFileName);
        System.out.println(listOfAll);

    }

    @SuppressWarnings("ConstantConditions")
    private static String getListOfAll(String pathToDirectory, File directory) {
        String[] listOfDirectory = directory.list();
        StringBuilder listOfAll = new StringBuilder("");
        for (String element : listOfDirectory) {
            String pathToElement = pathToDirectory + File.separator + element;
            File subDirectory = new File(pathToElement);
            if (subDirectory.isDirectory()) {
                listOfAll.append("dir:").append(element).append("\n");
                listOfAll.append(getListOfAll(pathToElement, subDirectory));
/*                String[] listOfSubDirectory = subDirectory.list();
                for (String file : listOfSubDirectory) {
                    listOfAll.append("file:").append(file).append("\n");
                }*/
            } else {
                listOfAll.append("file:").append(element).append("\n");
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
