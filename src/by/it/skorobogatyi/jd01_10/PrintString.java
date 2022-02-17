package by.it.skorobogatyi.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {

    public static void main(String[] args) {

        Class<String> stringClassStructure = String.class;
        Method[] stringMethods = stringClassStructure.getDeclaredMethods();
        StringBuilder stringBuilder = new StringBuilder();

        for (Method stringMethod : stringMethods) {

            int modifiers = stringMethod.getModifiers();
            if (Modifier.isStatic(modifiers)) {
                continue;
            }
            stringBuilder.append(stringMethod.getName()).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
