package by.it._classwork_.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {

        Class<?> structure = Math.class;
        Method[] declaredMethods = structure.getDeclaredMethods();
        for (Method method : declaredMethods) {
            StringBuilder outLine = new StringBuilder();
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)){
                outLine.append("public ");
            } else {
                continue;
            }
            if (Modifier.isStatic(modifiers)){
                outLine.append("static ");
            }
            outLine.append(method.getReturnType().getSimpleName()).append(" ");
            outLine.append(method.getName()).append('(');
            String delimiter="";
            Class<?>[] parameters = method.getParameterTypes();
            for (Class<?> parameter : parameters) {
                outLine.append(delimiter).append(parameter.getSimpleName());
                delimiter=",";
            }
            outLine.append(')');
            System.out.println(outLine);
        }
    }
}
