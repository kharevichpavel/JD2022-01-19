package by.it.zaretskaya.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            StringBuilder builder = new StringBuilder();
            int modifiers = method.getModifiers();
            if (!Modifier.isStatic(modifiers)){
                builder.append(method.getName());
            }else {
                continue;
            }
            System.out.println(builder);


        }



    }
}
