package by.it.yushkevich.jd01_14;


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
        // get file place
        String fileName = PathFinder.getFileName(TaskA.class, ROOT, FILENAME_BINARY);
        writeBinaryFile(fileName);

        List<Integer> intValues = readBinaryFile(fileName);
        outPutToConsole(intValues);

        String fileNameTxt = PathFinder.getFileName(TaskA.class, ROOT, TXT);
        outPutToTxt(intValues, fileNameTxt);
    }

    private static double outPutToConsole(List<Integer> intValues) {
        double sum = 0;
        for (Integer intValue : intValues) {
            sum += intValue;
            System.out.printf("%d ", intValue);
        }
        System.out.printf(Locale.ENGLISH, "%navg=%f%n", sum / intValues.size());
        return sum;
    }

    private static List<Integer> readBinaryFile(String fileName) {
        List<Integer> intValues = new ArrayList<>();
        try (
                // читаем из файла и заполняем массив.
                //  FileInputStream fileInputStream = new FileInputStream(fileName);
                // BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                DataInputStream dataInputStream = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(fileName)))
        ) {
            while (dataInputStream.available() > 0) {
                //available() пока есть что читать
                int value = dataInputStream.readInt();
                intValues.add(value);
            }

        } catch (IOException e) {
            throw new RuntimeException("IO Error", e);
        }
        return intValues;
    }

    private static void writeBinaryFile(String fileName) {
        try (
                // FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                // BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                //лучше всего инлайнить, чтоб создвавался только один ресурс
                DataOutputStream dataOutputStream = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(fileName)));
        ) {
            for (int i = 0; i < 20; i++) {
                int value = ThreadLocalRandom.current().nextInt(3000);
                dataOutputStream.writeInt(value);
            }

        } catch (IOException e) {
            throw new RuntimeException("IO Error", e);
        }
    }

    private static void outPutToTxt(List<Integer> intValues, String fileNameTxt) {


        try (
                PrintWriter printWriter = new PrintWriter(fileNameTxt);
        ) {
            double sum2 = 0;
            for (Integer intValue : intValues) {
                sum2 += intValue;
                printWriter.printf("%d ", intValue);
            }
            printWriter.printf(Locale.ENGLISH, "%navg=%f%n", sum2 / intValues.size());


        } catch (FileNotFoundException e) {
            throw new RuntimeException("IO Error", e);
        }
    }
}
