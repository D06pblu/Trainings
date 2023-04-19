package gof_pattrens.behavioral.memento;

public class Caretaker {                //опекун. Хранит переданные ему снимки
    Memento memento;
    public Memento getMemento(){        //получаем снимок, т.е. сохраняем игру
        return memento;
    }
    public void setMemento(Memento memento){       //восстанавливаем сохранение снимка, т.е. загружаем сохранение игры
        this.memento=memento;
    }
}
