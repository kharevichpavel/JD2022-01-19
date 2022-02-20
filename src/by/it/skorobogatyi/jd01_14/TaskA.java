package by.it.skorobogatyi.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;



public class TaskA {

    private static final String ROOT = "src";
    private static final String BIN_NAME = "dataTaskA.bin";
    private static final String TXT_NAME = "resultTaskA.txt";


    public static void main(String[] args) {

        String binFileName = FilenameGetter.getFilename(TaskA.class, ROOT, BIN_NAME);

        writeInBinaryFile(binFileName);

        List<Integer> integers = readFromBinary(binFileName);

        outputToConsole(integers);

        outputToTXTFile(integers);


    }


    private static void writeInBinaryFile(String filename) {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(filename)
                        )
                )
        ) {
            for (int i = 0; i < 20; i++) {
                int nextInt = ThreadLocalRandom.current().nextInt(1000);
                dataOutputStream.writeInt(nextInt);
            }
        } catch (IOException e) {
            throw new RuntimeException("IO error", e);
        }
    }

    private static ArrayList<Integer> readFromBinary(String filename) {
        ArrayList<Integer> array = new ArrayList<>();

        try (
                DataInputStream dataInputStream = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(filename)
                        )
                )
        ) {
            while (dataInputStream.available() > 0) {
                array.add(dataInputStream.readInt());
            }
        } catch (IOException e) {
            throw new RuntimeException("IO error", e);
        }
        return array;
    }

    private static void outputToConsole(List<Integer> integers) {
        double sum = 0;
        for (Integer integer : integers) {
            System.out.printf("%d ", integer);
            sum += integer;
        }
        System.out.printf(Locale.ENGLISH, "%navg=%f", sum / integers.size());
    }

    private static void outputToTXTFile(List<Integer> integers) {
        String txtFileName = FilenameGetter.getFilename(TaskA.class, ROOT, TXT_NAME);
        try (PrintWriter printWriter = new PrintWriter(txtFileName)) {
            double sum = 0;
            for (Integer integer : integers) {
                printWriter.printf("%d ", integer);
                sum += integer;
            }
            printWriter.printf(Locale.ENGLISH, "%navg=%f", sum / integers.size());
        } catch (IOException e) {
            throw new RuntimeException("IO error", e);
        }
    }
}
