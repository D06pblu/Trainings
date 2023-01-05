package not_strong_references.phantom;
import java.lang.ref.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);

        String o = new String("test");
        ReferenceQueue<TestClass> queue = new ReferenceQueue<>();
        Reference ref = new MyPhantomReference<>(new TestClass(), queue);
        PhantomReference phantomReference = new PhantomReference(o, queue);
        SoftReference softReference = new SoftReference(o);
        queue.remove();


        System.out.println("ref = " + ref);

        Thread.sleep(5000);

        System.out.println("Вызывается сборка мусора!");

        System.gc();
        Thread.sleep(300);

        System.out.println("ref = " + ref);

        Thread.sleep(5000);

        System.out.println("Вызывается сборка мусора!");

        System.gc();
    }
}
