package by.it.kravchenko.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> structure = Math.class;
        Field[] fields = structure.getFields();
        for (Field field : fields) {
            StringBuilder outFields = new StringBuilder();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                outFields.append("public ");
            } else {
                continue;
            }
            outFields.append(field.getType()).append(" ");
            outFields.append(field.getName());
            System.out.println(outFields);

        }

        Method[] declaredMethods = structure.getDeclaredMethods();
        for (Method method : declaredMethods) {
            StringBuilder out = new StringBuilder();
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                out.append("public ");
            } else {
                continue;
            }
            if (Modifier.isStatic(modifiers)) {
                out.append("static ");
            }
            out.append(method.getReturnType().getSimpleName()).append(" ");
            out.append(method.getName()).append("(");
            String delimiter = "";
            Class<?>[] parameters = method.getParameterTypes();
            for (Class<?> parameter : parameters) {
                out.append(delimiter).append(parameter.getSimpleName());
                delimiter = ",";

            }
            out.append(")");
            System.out.println(out);
        }
    }
}
