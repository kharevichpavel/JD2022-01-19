package by.it.burov.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<?> structure = Math.class;
        fields(structure);
        methods(structure);
    }

    private static void methods(Class<?> structure) {
        Method[] methods = structure.getDeclaredMethods();
        for (Method method : methods) {
            StringBuilder outLine = new StringBuilder();
            int modifiers = method.getModifiers();
            if(Modifier.isPublic(modifiers)) {
                outLine.append("public ");
            }else{
                continue;
            }
            if(Modifier.isStatic(modifiers)) {
                outLine.append("static ");
            }else{
                continue;
            }
            outLine.append(method.getReturnType().getSimpleName()).append(" ");
            outLine.append(method.getName()+('('));
            String delimeter = "";
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameter : parameterTypes) {
                outLine.append(delimeter).append(parameter.getSimpleName());
                delimeter = ",";
            }
            outLine.append(')');
            System.out.println(outLine);
        }
    }

    private static void fields(Class<?> structure) {
        Field[] fields = structure.getDeclaredFields();
        for (Field field : fields) {
            StringBuilder outLineField = new StringBuilder();
            if(Modifier.isPublic(field.getModifiers())) {
                outLineField.append("public ");
            }else{
                continue;
            }
            if(Modifier.isStatic(field.getModifiers())) {
                outLineField.append("static ");
            }else{
                continue;
            }
            outLineField.append(field.getType().getSimpleName()).append(" ");
            outLineField.append(field.getName());
            System.out.println(outLineField);
        }
    }
}
