package by.it.tarend.jd01_09;

import java.util.Scanner;

public class Reader {

    private static final String MESSAGE = "Введите выражение или команду >> ";

    public String readFromConsole() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}