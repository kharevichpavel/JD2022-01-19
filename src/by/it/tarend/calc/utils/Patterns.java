package by.it.tarend.calc.utils;

public class Patterns {

    private Patterns() { // что бы никто не мог пользоваться делаем приватный конструктор
    }
    // 2.0322+2 1.04*5.9{-1, -2.2, 3}+{1,1,1}  {{1,1,1},{2,2,2}} + {{1,1,1}, {3,3,3}}
    public static final String OPERATION = "[-*+/=]";
    public static final String SPACES = "//s";
    public static final String SCALAR = "-?[0-9]+(\\.[0-9]*)?";
    public static final String VECTOR = "\\{("+ SCALAR +")(," + SCALAR +")*}";
    public static final String MATRIX = "\\{("+ VECTOR +")(," + VECTOR +")*}";
}
