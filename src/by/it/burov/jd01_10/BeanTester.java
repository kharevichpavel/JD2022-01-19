package by.it.burov.jd01_10;

import java.lang.reflect.Method;

public class BeanTester {
    public static void main(String[] args) throws Exception {
        Class<Bean> beanClass = Bean.class;
        Method[] methods = beanClass.getDeclaredMethods();
        Object o = beanClass.getConstructor().newInstance();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Param.class)) {
                int a  = method.getAnnotation(Param.class).a();
                int b  = method.getAnnotation(Param.class).b();
                System.out.println(method.invoke(o,a,b));
                method.setAccessible(true);
                System.out.println(method.getName());
            }
        }
    }
}


