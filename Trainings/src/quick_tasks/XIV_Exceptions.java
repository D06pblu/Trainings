package quick_tasks;
/*
1. Hello
2. NullPointerException
3. NoClassDefFoundError
4. ExceptionInitializerError
 */
public class XIV_Exceptions {
    static {
        if (true) throw new NullPointerException();
    }
    static void run(){
        System.out.println("Hello");
    }
}

class Main{
    public static void main(String[] args) {
        try{
            XIV_Exceptions.run();
        }
        catch (Throwable e){
            e.printStackTrace();
        }

    }
}

/*
Мы вызываем метод run, начинается инициализация класса, вызывается NPE. NPE ловится нашим кэтчем,
вылетает ошибка ExceptionInitializerError у которой причиной значится NPE
Но т.к. в статик инициализаторе случился экспешн, то при любом новом обращении к данному классу будет всегда кидаться
NoClassDefFoundError, т.к. jvm не грузит этот класс из-за ошибки
 */
