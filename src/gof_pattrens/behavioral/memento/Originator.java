package gof_pattrens.behavioral.memento;

public class Originator {     //пилим сохранение для игры Цивилизации   //родительский файл, Создатель
    private String country;
    private int partyYear;
    public void set(String country, int partyYear){
        this.country=country;
        this.partyYear=partyYear;
    }

    public void setMemento(Memento memento){        //восстановление состояния
        country = memento.getCountry();
        partyYear = memento.getPartyYear();
    }

    public Memento createMemento(){                 //сохранение состояния
        return new Memento(country, partyYear);
    }

    @Override
    public String toString() {
        return "Originator{" +
                "country='" + country + '\'' +
                ", partyYear=" + partyYear +
                '}';
    }
}
