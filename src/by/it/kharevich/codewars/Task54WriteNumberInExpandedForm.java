package by.it.kharevich.codewars;

import java.util.ArrayList;
import java.util.List;

public class Task54WriteNumberInExpandedForm {
    public static String expandedForm(int num)    {
        String[] line = Integer.toString(num).split("");
        List<Object> lineRes = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int x;
        for (int i = 0; i < line.length; i++) {
            x = Integer.parseInt(line[i]);
            lineRes.add(x);
            if ((1 <= Integer.parseInt(line[i])) && Integer.parseInt(line[i]) <=9) {
                stringBuilder.append(lineRes.get(i)+"0".repeat(line.length - lineRes.size())+" + ");
            }
        }
        stringBuilder.delete(stringBuilder.length()-3,stringBuilder.length());
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(77286));
    }
}

/*
 public static String expandedForm(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }
 */