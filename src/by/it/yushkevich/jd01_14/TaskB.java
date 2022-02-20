package by.it.yushkevich.jd01_14;

import java.io.Reader;

public class TaskB {

    public static final String POEM_TXT = "Poem.txt";
    public static final String ROOT = "src";

    public static void main(String[] args) {

        String fileName = PathFinder.getFileName(TaskA.class, ROOT, POEM_TXT);
        



        System.out.println(fileName);
    }
}
