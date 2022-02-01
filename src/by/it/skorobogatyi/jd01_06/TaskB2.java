package by.it.skorobogatyi.jd01_06;

public class TaskB2 {

    public static void main(String[] args) {

        String initialString = Poem.text;

        initialString = initialString.replace("...", "");
        String stringWithoutNextLines = initialString.replace("\n", " ");

        String[] words = stringWithoutNextLines.split("[!.]\s");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\s?\\p{Punct}\\s+", " ");
            words[i] = words[i].trim();
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {

                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        for (String string : words) {
            System.out.println(string);
        }
    }
}
