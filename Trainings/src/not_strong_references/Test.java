package not_strong_references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Test {
    public static void main(String[] args) {
        Object o = new Object();

        SoftReference softReference = new SoftReference(o);
        WeakReference weakReference = new WeakReference(o);

        ReferenceQueue referenceQueue = new ReferenceQueue();
        PhantomReference phantomReference = new PhantomReference(o,referenceQueue);

        System.out.println(softReference);
        System.out.println(softReference.get());
        System.out.println(weakReference);
        System.out.println(weakReference.get());
        System.out.println(phantomReference);
        System.out.println(phantomReference.get());

        o=null;
        softReference=null;
        System.gc();
        System.out.println("**************");

        System.out.println(softReference);
//        System.out.println(softReference.get());
        System.out.println(weakReference);
        System.out.println(weakReference.get());
        System.out.println(phantomReference);
        System.out.println(phantomReference.get());

        int i = 2 >>> 2;
        System.out.println(i);

        int b = 64>>2;
        System.out.println(b);
    }
}
