package nested_classes;

public class WTF {
    public static void main(String[] args) {
        Motorcycle.Engine.pistonsCount=3;
        Motorcycle.Engine engine = new Motorcycle.Engine();
        engine.twoValves();
        engine.horsePower=110;

    }
    public interface InterfaceA {
        default void printSomething() {
            System.out.println("I_01 am inside A interface");
        }
    }

class ClassB implements InterfaceA{
}
    InterfaceA a=new ClassB();
}