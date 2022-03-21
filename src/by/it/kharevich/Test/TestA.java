package by.it.kharevich.Test;


import java.util.Locale;

public class TestA {
    public static void main(String[] args) {
        String[] details = new String[4];
        details[0]= "motor";
        details[1]= "door";
        details[2]= "abs";
        details[3]= "glass";
        for (String detail : details) {
            System.out.printf("%s%n", detail);
        }
    }
}
