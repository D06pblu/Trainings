package multithreading.secondCircle;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Runnable run = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Run mtfckr! " + i);
            }
        };

        Callable call = () -> "call";
        FutureTask<String> futureTask = new FutureTask<>(call);

        new Thread(futureTask).start();
        for (int i = 0; i < 5; i++){
            System.out.println(futureTask.get());
        }

        new Thread(run).start();

    }
}
