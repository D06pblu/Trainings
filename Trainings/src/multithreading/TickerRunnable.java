package multithreading;

public class TickerRunnable implements Runnable{
private final String name;

    public TickerRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(name+ " тикер: " +(i+1));
        }
    }
}

class test1 {
    public static void main(String[] args) {
        TickerRunnable first = new TickerRunnable("Первый");
        TickerRunnable second = new TickerRunnable("Второй");
        TickerRunnable third = new TickerRunnable("Третий");

        Thread thread = new Thread(first);              //можно через трэд.старт
        thread.start();
        System.out.println(thread.getState());
        //ExecutorService executorService = Executors.newFixedThreadPool(3);
        //executorService.submit(first);                  //можно через экзекьютор сервис.сабмит
        //executorService.submit(second);                 //
        //executorService.submit(third);
        //executorService.shutdown();                     //без него потоки не остановятся и программа будет висеть запущенной
        
        System.out.println("кажись трэд помер");
        System.out.println(thread.getState());

        thread.start();
    }
}
