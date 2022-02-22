package by.it.tarend.jd01_10;

import java.lang.reflect.Method;


public class BeanTester {

    public static void main(String[] args) throws Exception {

        Class<?> beanClass = Bean.class;
        Method[] methods = beanClass.getDeclaredMethods();
        Object object = null;
        for (Method method : methods) {
            if (method.isAnnotationPresent(Param.class)) {
                if (object == null) {
                    object = beanClass.getConstructor().newInstance(); // пересмотреть про это. создание объекта?
                }
                Param annotation = method.getAnnotation(Param.class);
                String[] parameters = annotation.toString().replaceAll("(.*\\()|[a-z=)]", "").trim().split(",");
                int a = Integer.parseInt(parameters[0].trim());
                int b = Integer.parseInt(parameters[1].trim());
                System.out.println(method.getName() + " " + method.invoke(object, a, b));
            }
        }

    }
}

