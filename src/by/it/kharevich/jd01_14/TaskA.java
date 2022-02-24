package by.it.kharevich.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class TaskA {

    public static final String FILENAME_BINARY = "dataTaskA.bin";
    public static final String ROOT = "src";
    public static final String TXT = "resultTaskA.txt";

    public static void main(String[] args) {

        String filename = PathFinder.getFilename(TaskA.class, ROOT, FILENAME_BINARY);
        writeBinaryFile(filename);
        List<Integer> intValues = readBinaryFile(filename);
        outputToConsole(intValues);
        String filenameTxt = PathFinder.getFilename(TaskA.class, ROOT, TXT);
        outputToTxt(intValues, filenameTxt);
    }

    private static void writeBinaryFile(String filename) {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))
        ) {
            for (int i = 0; i < 20; i++) {
                int value = ThreadLocalRandom.current().nextInt(2000);
                dataOutputStream.writeInt(value);
            }
        } catch (IOException e) {
            throw new RuntimeException("IO ERROR", e);
        }
    }

    private static List<Integer> readBinaryFile(String filename) {
        List<Integer> intValues = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            while (dataInputStream.available() > 0) {
                int value = dataInputStream.readInt();
                intValues.add(value);
            }

        } catch (IOException e) {
            throw new RuntimeException("IO ERROR", e);
        }
        return intValues;
    }

    private static void outputToConsole(List<Integer> intValues) {
        double sum = 0;
        for (Integer intValue : intValues) {
            System.out.printf("%d ", intValue);
            sum += intValue;
        }
        System.out.printf(Locale.ENGLISH, "%navg=%f%n", sum / intValues.size());
    }

    private static void outputToTxt(List<Integer> intValues, String filenameTxt) {
        try (PrintWriter printWriter = new PrintWriter(filenameTxt)) {
            double sum2 = 0;
            for (Integer intValue : intValues) {
                printWriter.printf("%d ", intValue);
                sum2 += intValue;
            }
            printWriter.printf(Locale.ENGLISH, "%navg=%f%n", sum2 / intValues.size());
        } catch (FileNotFoundException e) {
            throw new RuntimeException("IO ERROR", e);
        }
    }
}
