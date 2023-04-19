package jat_tasks.inheritance;

public class Test {
    public static void main(String[] args) {
        try {
            A ab = new B();
        } catch (Throwable e) {
        }
        System.out.println(A.a);
        System.out.println(B.b);
        B b = new B();
    }
}
