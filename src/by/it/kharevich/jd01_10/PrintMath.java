package by.it.kharevich.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {

        Class<Math> structure = Math.class;

        Field[] fields = structure.getFields();
        for (Field field : fields) {
            StringBuilder printFields = new StringBuilder();
            int modFields = field.getModifiers();
            if (!Modifier.isPublic(modFields)) {
                continue;
            }
            printFields.append(field.getType()).append(" ");
            printFields.append(field.getName());
            System.out.println(printFields);
        }

        Method[] declaredMethods = structure.getDeclaredMethods();
        for (Method method : declaredMethods) {
            StringBuilder printLine = new StringBuilder();
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                printLine.append("public ");
            } else {
                continue;
            }
            if (Modifier.isStatic(modifiers)) {
                printLine.append("static ");
            }
            printLine.append(method.getReturnType().getSimpleName()).append(" ");
            printLine.append(method.getName()).append("(");
            String delimiter = ("");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameter : parameterTypes) {
                printLine.append(delimiter).append(parameter.getSimpleName());
                delimiter = ",";
            }
            printLine.append(")");
            System.out.println(printLine);
        }
    }
}
