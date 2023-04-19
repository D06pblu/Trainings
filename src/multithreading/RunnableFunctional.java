package multithreading;

public class RunnableFunctional {               //тестирование функциональщины в написании
    public static void main(String[] args) {
        Runnable task = ()->{                   //вот этой функциональщины
            for (int i=0; i<10; i++){
                System.out.println("Первый тикер: " +(i+1));
            }
        };
        Runnable task2=()->{
            for (int i=0; i<10; i++){
                System.out.println("Второй тикер: " +(i+1));
            }
        };
        Thread thread = new Thread(task);
        Thread thread1 = new Thread(task2);
        thread.start();
        thread1.start();
    }
}
