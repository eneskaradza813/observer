package mypackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

        Class myClassRef = Class.forName("mypackage.MyClass");
        
        Method[] methods = myClassRef.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }

}
