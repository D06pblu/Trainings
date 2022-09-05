package GoF_Pattrens.Behavioral.Memento;

public class Caretaker {                //опекун. Хранит переданные ему снимки
    Memento memento;
    public Memento getMemento(){        //восстанавливаем сохранение снимка, т.е. загружаем сохранение игры
        return memento;
    }
    public void setMemento(Memento memento){        //получаем снимок, т.е. сохраняем игру
        this.memento=memento;
    }
}
