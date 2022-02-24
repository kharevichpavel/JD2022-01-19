package by.it.zaretskaya.jd01_14;

public class TaskA {

    public static final String FILENAME_BYNARY = "data TaskA.bin";
    public static final String ROOT = "src";

    public static void main(String[] args) {
        String filename=PathFinder.getFileName(TaskA.class, ROOT, FILENAME_BYNARY);
        System.out.println(filename);
    }
}
