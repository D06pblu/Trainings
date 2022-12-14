package not_strong_references.phantom;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class QueueReadingThread<TestClass> extends Thread {

    private ReferenceQueue<TestClass> referenceQueue;

    public QueueReadingThread(ReferenceQueue<TestClass> referenceQueue) {
        this.referenceQueue = referenceQueue;
    }

    @Override
    public void run() {

        System.out.println("Поток, отслеживающий очередь, стартовал!");
        Reference ref = null;

        //ждем, пока в очереди появятся ссылки
        while ((ref = referenceQueue.poll()) == null) {

            try {
                Thread.sleep(50);
            }

            catch (InterruptedException e) {
                throw new RuntimeException("Поток " + getName() + " был прерван!");
            }
        }

        //как только в очереди появилась фантомная ссылка - очистить ее
        ((MyPhantomReference) ref).cleanup();
    }
}