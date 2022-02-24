package by.it.zaretskaya.jd01_14;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskA {

    public static final String FILENAME_BYNARY = "data TaskA.bin";
    public static final String ROOT = "src";

    public static void main(String[] args) {
        String filename=PathFinder.getFileName(TaskA.class, ROOT, FILENAME_BYNARY);
        try (
        DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(filename)
                )
        )
        ) {
            for (int i = 0; i < 20; i++) {
                int value = ThreadLocalRandom.current().nextInt(2000);
                dataOutputStream.writeInt(value);
            }

        } catch (IOException e) {
          throw  new RuntimeException("IO error",e);
        }

        List<Integer> intValues=new ArrayList<>();
        try(

        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)))
        ){
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
