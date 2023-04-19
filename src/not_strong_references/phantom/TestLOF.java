package not_strong_references.phantom;

import java.lang.ref.ReferenceQueue;

public class TestLOF {
    public static void main(String[] args) {
        Integer i = 1;
        ReferenceQueue referenceQueue = new ReferenceQueue<>();
        LargeObjectFinalizer largeObjectFinalizer = new LargeObjectFinalizer(i, referenceQueue);
        largeObjectFinalizer.finalizeResources();
    }
}
