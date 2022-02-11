package by.it.kravchenko.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> structure = String.class;
        Method[] methods = structure.getDeclaredMethods();
        for (Method method : methods) {
            StringBuilder out = new StringBuilder();
            int modifiers = method.getModifiers();
            if (!Modifier.isStatic(modifiers)) {
                out.append(method.getName());
            } else {
                continue;
            }
            System.out.println(out);
        }
    }
}
