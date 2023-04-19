package gof_pattrens.behavioral.memento;

public class Game {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.set("Persia", 755);
        System.out.println(originator);

        Caretaker caretaker = new Caretaker();      //делаем новое сохранение
        caretaker.setMemento(originator.createMemento());

        originator.set("China", 1400);
        System.out.println(originator);

        Caretaker caretaker1 = new Caretaker();     //делаем второе сохранение
        caretaker1.setMemento(originator.createMemento());

        System.out.println("возвращаемся к первому сохранению");
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator);
    }
}