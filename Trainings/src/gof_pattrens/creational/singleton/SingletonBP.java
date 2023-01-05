package gof_pattrens.creational.singleton;

public class SingletonBP {  //решение Билла Пью - Initialization on Demand Holder

    private SingletonBP(){};

    private static class SingletonHolder{   //создаем внутренний класс и создаем синглтон в нем
        private final static SingletonBP singletonBP = new SingletonBP();
    }
    public static SingletonBP getSingletonBP(){
        return SingletonHolder.singletonBP;
    }
/**
 * почему ленивая? Потому что статика nested static class загружается только в момент обращения к нему
 * брейкпойнты в таком конфиге позволяют это проверить
 */
    public static void main(String[] args) {
        System.out.println("Hello");
        SingletonBP singletonBP = SingletonBP.getSingletonBP();
    }
}