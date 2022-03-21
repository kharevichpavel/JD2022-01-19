package by.it.kharevich.Test;

public class TaskLineNumber {
    public static void main(String[] args) {

        String line = "fgfghdh3432";
        int result = countNumberInLine(line);
        System.out.println(result);
    }

    public static int countNumberInLine (String line){
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }
}
