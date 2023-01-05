package gof_pattrens.creational.singleton;

public class SingletonF {       //не ленивая \ жадная\ eagor инициализация
    private static SingletonF singletonF = new SingletonF();

    private SingletonF(){}

    public static SingletonF getSingletonF(){
        return singletonF;
    }
}
