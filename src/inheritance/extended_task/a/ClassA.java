package inheritance.extended_task.a;

public class ClassA {
    int i = 1;
    int k = 100;
    public ClassA() {
        System.out.println("конструктор А для i" + getI());
        System.out.println("конструктор А для k" + getK());
    }
    public int getI() {
        return i;   // видно что сюда main не заходит
    }
    public int getK() {
        return k;   // а сюда заходит. Потому что getI переопределен в классе Б и i возвращается оттуда
    }
}
