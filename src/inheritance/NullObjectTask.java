package inheritance;

public class NullObjectTask {
    public static void main(String args[]) {
        NullObjectTask t1 = new NullObjectTask();
        t1.method1(null);
    }
    
    public void method1(Object o) {
        System.out.println("object call");
    }

    public void method1(String o) {
        System.out.println("String call");
    }
}

