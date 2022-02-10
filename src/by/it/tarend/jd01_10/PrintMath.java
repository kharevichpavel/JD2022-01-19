package by.it.tarend.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {

    public static void main(String[] args) {

        Class<Math> structure = Math.class;
        Method[] declaredMethods = structure.getDeclaredMethods();
        for (Method method : declaredMethods) {
            StringBuilder outLine = new StringBuilder();
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                outLine.append("public ");
            } else {
                continue;
            }
            if (Modifier.isStatic(modifiers)) {
                outLine.append("static ");
            }  else {
                continue;
            }
            outLine.append(method.getReturnType().getSimpleName()).append(" ");
            outLine.append(method.getName()).append("(");
            Class<?>[] parameters = method.getParameterTypes();
            String delimiter = "";
            for (Class<?> parameter : parameters) {
                outLine.append(delimiter).append(parameter.getSimpleName());
                delimiter = ",";
            }
            outLine.append(")");
            System.out.println(outLine);
        }

        Field[] fields = structure.getFields();
        for (Field field : fields) {
            StringBuilder outLine = new StringBuilder();
            int fieldModifiers = field.getModifiers();
            if (Modifier.isPublic(fieldModifiers)) {
                outLine.append("public ");
            } else {
                continue;
            }
            outLine.append(field.getType()).append(" ").append(field.getName());
            System.out.println(outLine);
        }
    }
}
