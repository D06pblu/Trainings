package interfaces.functional.task01;

@FunctionalInterface
interface Sayable{              //такой ф.интерфейс можно, т.к. остальные методы наследованы от Object и не являются абстрактными
    void say(String msg);

    int hashCode();
    String toString();
    boolean equals(Object obj);
}

//@FunctionalInterface - если поставить аннотацию ф.интерфейс, то будет ошибка, т.к. два абстрактных метода
interface Talkable extends Sayable{
    void talk(String msg);

    int hashCode();
    String toString();
    boolean equals(Object obj);
}
