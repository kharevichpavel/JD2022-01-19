package by.it.zaretskaya.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {

    public static void main(String[] args) {
        Class<?> structure = Math.class;
        Method[] declaredMethods = structure.getDeclaredMethods();
        for (Method method : declaredMethods) {
            StringBuilder outline = new StringBuilder();
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)){
                outline.append("public ");
            }  else {
                continue;
            }
              if (Modifier.isStatic(modifiers)){
                  outline.append("static ");
              }   else {
                  continue;
              }
              outline.append(method.getReturnType().getSimpleName()).append(" ");
              outline.append(method.getName()).append('(');
              String delimiter="";
              Class<?>[] parameters = method.getParameterTypes();
            for (Class<?> parameter : parameters) {
                outline.append(delimiter).append(parameter.getSimpleName());
                delimiter=",";

            }
            outline.append(')');
            System.out.println(outline);



        }
        Field[] declaredFields = structure.getDeclaredFields();
        for (Field field : declaredFields) {
            StringBuilder outLine = new StringBuilder();
            int fieldModifiers = field.getModifiers();
            if (Modifier.isPublic(fieldModifiers)) {
                outLine.append("public ");

            }    else {
                continue;
            }
            outLine.append(field.getType()).append(" ").append(')');
            System.out.println(outLine);


        }



    }
}
