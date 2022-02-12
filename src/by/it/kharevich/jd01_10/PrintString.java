package by.it.kharevich.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {

        Class<String> structure = String.class;

        Method[] declaredMethods = structure.getDeclaredMethods();
        for (Method stringMethod : declaredMethods) {
            StringBuilder printStringName = new StringBuilder();
            int modifiers = stringMethod.getModifiers();
            if (!Modifier.isStatic(modifiers)) {
                printStringName.append(stringMethod.getName());
            } else {
                continue;
            }
            System.out.println(printStringName);
        }
    }
}
