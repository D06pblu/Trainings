package gof_pattrens.creational.singleton;

public class SingletonL{         //lazy initialization (-- он не потокобезопасный)
    private static SingletonL singleton;
    public static SingletonL getSingleton(){
        if(singleton==null)
            singleton = new SingletonL();
        return singleton;
    }
}