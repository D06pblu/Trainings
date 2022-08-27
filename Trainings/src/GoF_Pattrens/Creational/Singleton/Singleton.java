package GoF_Pattrens.Creational.Singleton;

public class Singleton{
    private static Singleton singleton;
    public static Singleton getSingleton(){
        if(singleton==null)
            singleton = new Singleton();
        return singleton;
    }
}