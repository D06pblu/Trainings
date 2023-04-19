package inheritance.extended_task.b;

import inheritance.extended_task.a.ClassA;

public class ClassB extends ClassA {
    int i = 2;
    int b = 200;
    public ClassB() {
        System.out.println("конструктор В " + getI());
    }

    public int getI() {
        return i;
    }

    public int getB() {
        return b;
    }
}
