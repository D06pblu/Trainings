package gof_pattrens.creational.singleton;

public class SingletonVolatile {
    private static volatile SingletonVolatile singletonVolatile; //volatile обязателен чтобы двойная блокировка сработала

    private SingletonVolatile(){}

    public static SingletonVolatile getSingletonVolatile(){
        if(singletonVolatile==null)
            synchronized (SingletonVolatile.class){
                if(singletonVolatile==null)
                    singletonVolatile=new SingletonVolatile();
            }
        return singletonVolatile;
    }
}
