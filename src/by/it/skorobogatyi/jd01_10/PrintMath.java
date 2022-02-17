package by.it.skorobogatyi.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {

    public static void main(String[] args) {

        Class<Math> mathClassStructure = Math.class;

        Field[] fields = mathClassStructure.getFields();
        Method[] declaredMethods = mathClassStructure.getDeclaredMethods();
        StringBuilder string = new StringBuilder();

        for (Field field : fields) {
            int modifiers = field.getModifiers();

            if (Modifier.isPublic(modifiers)) {
                string.append("public ");

            } else break;

            if (Modifier.isStatic(modifiers)) {
                string.append("static ");
            }

            string.append(field.getType()).append(" ");
            string.append(field.getName());
            string.append("\n");
        }



        for (Method declaredMethod : declaredMethods) {
            int modifiers = declaredMethod.getModifiers();

            if (Modifier.isPublic(modifiers)) {
                string.append("public ");

            } else continue;

            if (Modifier.isStatic(modifiers)) {
                string.append("static ");
            }

            string.append(declaredMethod.getReturnType().getTypeName()).append(" ");
            string.append(declaredMethod.getName());

            string.append("(");
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            String delimiter = "";

            for (Class<?> parameterType : parameterTypes) {
                string.append(delimiter);
                string.append(parameterType.getName());
                delimiter = ",";
            }

            string.append(")");
            string.append("\n");
        }
        System.out.println(string);
    }
}
