package GoF_Pattrens.Creational.Singleton;

public class SingletonSynchro {     //просто синхронизированный синглтон
    private static SingletonSynchro singletonSynchro;
    private SingletonSynchro(){}
    public static synchronized SingletonSynchro getSingletonSynchro(){
        if (singletonSynchro==null){
            singletonSynchro = new SingletonSynchro();
        }
        return singletonSynchro;
    }
}
