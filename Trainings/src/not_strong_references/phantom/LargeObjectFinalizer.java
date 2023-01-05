package not_strong_references.phantom;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
//avoid using the finalize method and improve the finalization process
public class LargeObjectFinalizer extends PhantomReference<Object> {

    public LargeObjectFinalizer(Object referent, ReferenceQueue<? super Object> q) {
        super(referent, q);
    }

    public void finalizeResources() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();     //для отслеживания поставленных в очередь ссылок
        List<LargeObjectFinalizer> references = new ArrayList<>();          //для последующей очистки
        List<Object> largeObjects = new ArrayList<>();                      //для имитации большой структуры данных

        for (int i = 0; i < 10; ++i) {                                      //создаем эти большие объекты
            Object largeObject = new Object();
            largeObjects.add(largeObject);
            references.add(new LargeObjectFinalizer(largeObject, referenceQueue));
        }

        largeObjects = null;            //manually free up a large piece of data by dereferencing the largeObjects list
        System.gc();            //isn't triggering garbage collection immediately – it's simply a hint for JVM to trigger the process

        Reference<?> referenceFromQueue;
        for (PhantomReference<Object> reference : references) {     //make sure that all references are enqueued
            System.out.println(reference.isEnqueued());
        }

        while ((referenceFromQueue = referenceQueue.poll()) != null) {      //poll out the enqueued references and do cleaning work for each of them
            ((LargeObjectFinalizer)referenceFromQueue).finalizeResources();
            referenceFromQueue.clear();
        }
        System.out.println("clearing ...");
    }
}
