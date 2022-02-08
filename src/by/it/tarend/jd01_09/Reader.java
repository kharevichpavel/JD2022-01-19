package by.it.tarend.jd01_09;

import java.util.Scanner;

public class Reader {

    private static final String MESSAGE = "Введите выражение или команду >> ";

    public String readFromConsole() {
        System.out.println(MESSAGE);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext()) {
            sc.next();
            System.out.print(MESSAGE);
            }
        return sc.nextLine();
    }
}
