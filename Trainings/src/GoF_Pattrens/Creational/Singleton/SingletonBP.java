package GoF_Pattrens.Creational.Singleton;

public class SingletonBP {  //решение Билла Пью - Initialization on Demand Holder
    private SingletonBP(){};
    private static class SingletonHolder{   //создаем внутренний класс и создаем синглтон в нем
        private final static SingletonBP singletonBP = new SingletonBP();
    }
    public static SingletonBP getSingletonBP(){
        return SingletonHolder.singletonBP;
    }
}
