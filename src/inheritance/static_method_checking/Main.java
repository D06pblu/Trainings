package inheritance.static_method_checking;

public class Main {
    public static void main(String[] args) {
        Child.staticMethod();
    }
}

class Parent {
    static void staticMethod() {
        String className = new Exception().getStackTrace()[0].getClassName();
        System.out.println("Method was called from " + className);
    }

}

class Child extends Parent{}
