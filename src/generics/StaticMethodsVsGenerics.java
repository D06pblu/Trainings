package generics;
/*
You can't use a class's generic type parameters in static methods or static fields. The class's type parameters
are only in scope for instance methods and instance fields. For static fields and static methods, they are shared
among all instances of the class, even instances of different type parameters, so obviously they cannot depend on
a particular type parameter.

It doesn't seem like your problem should require using the class's type parameter. If you describe what you are
trying to do in more detail, maybe we can help you find a better way to do it.
 */
public class StaticMethodsVsGenerics {
    public static void main(String[] args) {
        String s = new String("Hellou");
        Integer i = 99;
        MyClass.testStatic(s);

        MyClass<Integer, String> myClass = new MyClass<>();
        myClass.testNonStatic(i);
    }
}

class MyClass<T, U> {

    T t;
    U u;
    static public <T> void testStatic(T object) {
        System.out.println("Static method + " + object);
    }

    public <T> void testNonStatic(T object){
        System.out.println("Non static method + " + object);
    }
}