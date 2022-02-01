package by.it.skorobogatyi.jd01_06;


import java.util.regex.Pattern;

public class TaskC1 {



    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder(Poem.text);

        Pattern patternForLines = Pattern.compile("\n");

        String[] textLines = patternForLines.split(stringBuilder);

        int maxCharsCount = 0;
        for (String textLine : textLines) {
            if (textLine.length() > maxCharsCount) {
                maxCharsCount = textLine.length();
            }
        }

        for (int i = 0; i < textLines.length; i++) {

            if (textLines[i].length() == maxCharsCount) {
                continue;
            }

            boolean isEqual = false;
            int spacePosition = textLines[i].indexOf(" ");
            int counter = 1;

            while (!isEqual) {
                textLines[i] = textLines[i].substring(0, spacePosition) + " " + textLines[i].substring(spacePosition);
                spacePosition = textLines[i].indexOf(" ", spacePosition + counter + 1);

                if (textLines[i].length() == maxCharsCount) {
                    isEqual = true;
                }

                if (spacePosition == -1) {
                    spacePosition = textLines[i].indexOf(" ");
                    counter++;
                }
            }
        }

        for (String textLine : textLines) {
            System.out.println(textLine);
        }
    }


}
