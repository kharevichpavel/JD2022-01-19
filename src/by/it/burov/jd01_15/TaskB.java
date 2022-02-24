package by.it.burov.jd01_15;

import by.it.burov.jd01_14.PathFinder;

import java.io.*;


/**
 * author
 */
public class TaskB {// class

    public static void main(String[] args) {/* main */
        String inFilename = PathFinder.getFilename(TaskB.class, "src", "TaskB.java");
        String outFilename = PathFinder.getFilename(TaskB.class, "src", "TaskB.txt");
        StringBuilder lines = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inFilename)); BufferedWriter writer = new BufferedWriter(new FileWriter(outFilename))) {
            String inLine; //line from our file
            while ((inLine = reader.readLine()) != null) {
                lines.append(inLine).append("\n");
            }
            System.out.println(removeComments(lines.toString()));
            writer.write(removeComments(lines.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String removeComments(String line) {/* remover */
        StringBuilder result = new StringBuilder();
        int slashCounter = 0;
        int slashStar = 0;
        char[] inputLine = line.toCharArray();
        for (int i = 0; i < inputLine.length - 1; i++) {
            if ((inputLine[i] == '/') && (inputLine[i + 1] == '/')) {
                slashCounter = 1;
            } else if ((inputLine[i] == '/') && (inputLine[i + 1] == '*')) {
                slashStar = 1;
            }

            if ((slashCounter == 1) && (inputLine[i] == '\n')) {
                slashCounter = 0;
            } else if ((slashStar == 1) && (inputLine[i] == '*') && (inputLine[i + 1] == '/')) {
                slashStar = 0;
                i++;
                continue;
            }

            if (slashCounter == 0 && slashStar == 0) {
                result.append(inputLine[i]);
            }
        }
        return result.toString();
    }

}


