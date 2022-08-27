package ReflectionTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionCheck {
    public void showClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }
    public void showClassFields(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }
    public void showClassMethods(Object object){
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }

    public void showFieldAnnotation(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            Annotation[] annotations = field.getAnnotations();
            for(Annotation annotation : annotations){
                System.out.println(field.getName() + annotation.toString());
            }
        }
    }
}
