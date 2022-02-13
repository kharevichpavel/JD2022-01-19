package by.it.skorobogatyi.jd01_10;

import java.lang.reflect.Method;

public class BeanTester {

    public static void main(String[] args) throws Exception {

        Class<Bean> beanClass = Bean.class;
        Bean bean = beanClass.getConstructor().newInstance();

        Method[] declaredMethods = beanClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Param.class)) {

                Param param = declaredMethod.getAnnotation(Param.class);
                System.out.println(declaredMethod.getName());
                System.out.println(declaredMethod.invoke(bean, param.a(), param.b()));
            }
        }
    }
}
