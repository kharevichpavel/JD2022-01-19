package by.it.burov.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class TaskA {
    private static final String FILENAME_BINARY = "dataTaskA.bin";
    private static final String ROOT = "src";
    private static final String TXT = "resultTaskA.txt";

    public static void main(String[] args) {

        String filename = PathFinder.getFilename(TaskA.class, ROOT, FILENAME_BINARY);
        writeBinaryFile(filename);
        List<Integer> intValues = new ArrayList<>();
        outputToConsole(filename, intValues);
        String filenameTxt = PathFinder.getFilename(TaskA.class,ROOT,TXT);
        outputToTxt(intValues, filenameTxt);
    }

    private static void writeBinaryFile(String filename) {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(filename)));
        ) {
            for (int i = 0; i<20;i++){
                int value = ThreadLocalRandom.current().nextInt(2000);
                dataOutputStream.writeInt(value);
            }
        }catch (IOException e){
            throw new RuntimeException("IO error",e);
        }
    }

    private static void outputToConsole(String filename, List<Integer> intValues) {
        try (
                DataInputStream dataInputStream = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(filename)));
        ){
            while (dataInputStream.available()>0){
                int value = dataInputStream.readInt();
                intValues.add(value);
            }

        } catch (IOException e) {
            throw new RuntimeException("IO error",e);
        }
        double sum=0;
        for (Integer intValue : intValues) {
            sum+= intValue;
            System.out.printf("%d ",intValue);

        }
        System.out.printf(Locale.ENGLISH, "%navg=%f%n",sum/ intValues.size());
    }

    private static void outputToTxt(List<Integer> intValues, String filenameTxt) {
        try(PrintWriter printWriter = new PrintWriter(filenameTxt)) {
            double sum2=0;
            for (Integer intValue : intValues) {

                sum2+= intValue;
                printWriter.printf("%d ",intValue);

            }
            printWriter.printf(Locale.ENGLISH, "%navg=%f%n",sum2/ intValues.size());
        }catch (IOException e){
            throw new RuntimeException("IO error",e);
        }
    }
}

