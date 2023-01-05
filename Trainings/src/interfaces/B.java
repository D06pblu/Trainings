package interfaces;

interface A {
    int x = 10;
    default void m1(){
        System.out.println("Interface A, default method m1");
    }

    static void m2(){
        System.out.println("Interface A, static method m2");
    }

    void m3();
}
public class B implements A {
    int x = 20;
    public void m1(){
        System.out.println("Class B, method m1");
    }

    public void m2(){
        System.out.println("Class B, method m2");
    }

    @Override
    public void m3() {
        System.out.println("Class B, method m3");
    }
}
class Test {
    public static void main(String[] args){
        A a = new B();
        a.m1();                     // дефолтный метод переопределился
        A.m2();                     // обратиться к статик методу интерфейса можно как и к статик методу класс - через имя класса
//        a.m2();                     // не смотря на то что мы написал в В такой метод, вызвать его невозможно
        a.m3();                     // это обычный абстрактный метод из интерфейса, если обязательно надо переопределить
        System.out.println(a.x);    // переменная не перезаписалась в классе

        B b = new B();
        b.m1();
        A.m2();
        b.m2();                     // а тут метод m2 доступен, потому что это инстанс не Интерфейса А, а класса В
        b.m3();
        System.out.println(b.x);    // переменная перезаписалась в классе
    }
}