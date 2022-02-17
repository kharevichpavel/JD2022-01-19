package by.it.kuzma.jd01_10;


import java.lang.reflect.Method;

public class BeanTester {
    public static void main(String[] args)throws Exception {

        Class<Bean> beanClass = Bean.class;
        Method[] methods = beanClass.getDeclaredMethods();
        //Object o = beanClass;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Param.class)){
                System.out.println(method.getName());


            }
        }



    }
}
