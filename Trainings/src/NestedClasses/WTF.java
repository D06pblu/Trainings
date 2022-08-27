package NestedClasses;

import NestedClasses.Motorcycle;

public class WTF {
    public static void main(String[] args) {
        Motorcycle.Engine.pistonsCount=3;
        Motorcycle.Engine engine = new Motorcycle.Engine();
        engine.twoValves();
        engine.horsePower=110;

    }
    public interface InterfaceA {
        default void printSomething() {
            System.out.println("I am inside A interface");
        }
    }

class ClassB implements InterfaceA{
}
    InterfaceA a=new ClassB();
}