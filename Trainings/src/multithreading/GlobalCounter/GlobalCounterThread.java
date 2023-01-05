package multithreading.GlobalCounter;

public class GlobalCounterThread extends Thread{        //внес правки в соответствии с ревью
    public void run() {
        for (int i = 0; i < 10; i++) {
            GlobalCounter.tickCounter++;
            System.out.println("Тик номер " + i + " в треде " + GlobalCounterThread.currentThread().getName()
                    + ", а в глобальном счетчике это тик номер " + GlobalCounter.tickCounter);
            Thread.yield();
        }
    }
}
class GlobalCounter {
    static volatile int tickCounter;

    public static void main(String[] args) {
        GlobalCounterThread thread01 = new GlobalCounterThread();
        GlobalCounterThread thread02 = new GlobalCounterThread();

        thread01.start();
        thread02.start();
    }
}