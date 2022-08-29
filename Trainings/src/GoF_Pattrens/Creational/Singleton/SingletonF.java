package GoF_Pattrens.Creational.Singleton;

public class SingletonF {       //быстрая инициализация
    private static SingletonF singletonF = new SingletonF();

    private SingletonF(){}

    public static SingletonF getSingletonF(){
        return singletonF;
    }
}
