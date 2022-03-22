package by.it.kharevich.codewars;

public class Task30 {

    public int squareDigits(int n) {
        String[] line = String.valueOf(n).split("");
        StringBuilder stringBuilder = new StringBuilder();
        int number = 0;
        for (int i = 0; i < line.length; i++) {
            number = (int) Math.pow(Integer.parseInt(line[i]),2);
            stringBuilder.append(number);
        }
        n = Integer.parseInt(stringBuilder.toString());
        return n;
    }
}
