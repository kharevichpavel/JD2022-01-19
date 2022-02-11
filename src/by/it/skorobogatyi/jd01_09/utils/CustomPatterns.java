package by.it.skorobogatyi.jd01_09.utils;

public class CustomPatterns {


    public static final String SPACES = "\\s+";
    public static final String OPERATION = "[-+*/]";
    public static final String SCALAR = "-?[\\d]+(\\.[\\d]+)?";
    public static final String VECTOR = "\\{"+SCALAR+"((,)"+SCALAR+")*}";
    public static final String MATRIX = "\\{"+VECTOR+"((,)"+VECTOR+")*}";



}
