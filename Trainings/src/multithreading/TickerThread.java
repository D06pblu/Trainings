package multithreading;

public class TickerThread extends Thread {
String name;
public TickerThread(String name){
    this.name = name;
}

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(name +" tick: "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class test{
    public static void main(String[] args) {
        TickerThread first = new TickerThread("first");
        TickerThread second = new TickerThread("second");
        TickerThread third = new TickerThread("third");

        first.start();
        second.start();
        third.start();
    }
}
