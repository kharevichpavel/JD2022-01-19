package by.it.kuzma.jd01_10;



import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {

        Class<Math> structure = Math.class;

        Field[] fields = structure.getFields();
        Method[] declaredMethods = structure.getDeclaredMethods();

        for (Field field : fields) {
            StringBuilder outFieldLine = new StringBuilder();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                outFieldLine.append("public ");
            } else {
                continue;
            }
            if (Modifier.isStatic(modifiers)) {
                outFieldLine.append("static ");
            } else {
                continue;
            }
            outFieldLine.append(field.getType().getSimpleName()).append(" ");
            outFieldLine.append(field.getName());
            System.out.println(outFieldLine);

        }

        System.out.println("-".repeat(40));

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
            } else {
                continue;
            }
            outLine.append(method.getReturnType().getSimpleName()).append(" ");
            outLine.append(method.getName()).append('(');
            String delimiter = "";
            Class<?>[] parameters = method.getParameterTypes();
            for (Class<?> parameter : parameters) {
                outLine.append(delimiter).append(parameter.getSimpleName());
                delimiter = ",";
            }
            outLine.append(')');

            System.out.println(outLine);
        }
    }
}
