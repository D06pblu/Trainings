package gof_pattrens.creational.singleton;

public class SingletonSynchro {     //ленив, просто синхронизированный синглтон.  Потокобезопасен, но медленный
    private static SingletonSynchro singletonSynchro;

    private SingletonSynchro(){}

    public static synchronized SingletonSynchro getSingletonSynchro(){ //захватывается мьютекс класса
        if (singletonSynchro==null){
            singletonSynchro = new SingletonSynchro();
        }
        return singletonSynchro;
    }
}
