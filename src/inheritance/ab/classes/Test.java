package inheritance.ab.classes;

public class Test {
    public static void main(String[] args) {

        A a = new A();
        A ab = new B();
        B b = new B();
//        B ba = (B) new A();


        System.out.println(a.a);
        System.out.println(ab.a);
        System.out.println(b.a);
//        System.out.println(ba.a);
    }
}

class A {
    int a = 5;
}

class B extends A {
    int a = 10;
}
