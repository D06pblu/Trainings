package Multithreading.GlobalCounter;

public class GlobalCounterThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            GlobalCounter.tickCounter++;
            System.out.println("Тик номер " + i + " в треде " + GlobalCounterThread.currentThread().getName()
                    + ", а в глобальном счетчике это тик номер " + GlobalCounter.tickCounter);
        }
    }
}
class GlobalCounter {
    static int tickCounter;

    public static void main(String[] args) {
        GlobalCounterThread thread01 = new GlobalCounterThread();
        GlobalCounterThread thread02 = new GlobalCounterThread();

        thread01.start();
        thread02.start();
    }
}