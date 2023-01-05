package multithreading;

public class HorseTask {
        static Integer count=0;
        static ThreadOne threadOne = new ThreadOne();
        static ThreadOne threadTwo = new ThreadOne();

        public static void main(String[] args) throws InterruptedException {
                threadOne.start();
                threadTwo.start();
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(500);
                count = i+1;
            }
        }
    }

class ThreadOne extends Thread {

    @Override
    public void run() {
        while (HorseTask.count < 10) {
            System.out.println(Thread.currentThread().getName() + " " + HorseTask.count);
            try {
                Thread.sleep(505);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}