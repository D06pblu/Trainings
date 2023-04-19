package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TickerCallable implements Callable {
    private final String name;

    public TickerCallable(String name) {
        this.name = name;
    }
    @Override
    public Object call() throws Exception {
        for (int i=0; i<10; i++){
            System.out.println(name+ " тикер: " +(i+1));
        }
        return null;
    }
}

class testCallable{
    public static void main(String[] args) {
        TickerCallable first = new TickerCallable("First");
        TickerCallable second = new TickerCallable("IX_01");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(first);
        executorService.submit(second);
    }
}