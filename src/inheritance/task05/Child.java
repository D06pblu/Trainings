package inheritance.task05;

public class Child extends Parent{
    void print(String str) {
        System.out.println("Child - " + str );
    }
    void print(Object obj) {
        System.out.println("Child - " + obj);
    }
}
