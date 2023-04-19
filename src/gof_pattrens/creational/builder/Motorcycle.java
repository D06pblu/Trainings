package gof_pattrens.creational.builder;

public class Motorcycle{
    private String model; //понаделываем privat полей
    private String type;
    private int year;

    private Motorcycle(){}; //закрываем конструктор, во избежание

    @Override
    public String toString() {      //просто овверрайд чтоб печатало
        return "Motorcycle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                '}';
    }

    static class MotorcycleBuilder {     //пилим nested static класс, чтобы его можно было отдельно вызывать
        Motorcycle motorcycle = new Motorcycle();       //создаем пустой объект

        public MotorcycleBuilder setModel(String model){    //через сетеры вводим значения в переменные
            motorcycle.model=model;
            return this;
        }
        public MotorcycleBuilder setType(String type){
            motorcycle.type=type;
            return this;
        }
        public MotorcycleBuilder setYear(int year){
            motorcycle.year=year;
            return this;
        }
        public Motorcycle build(){      //в конце метод билд() чтобы возвращать готовый объект, набитый значениями
            return motorcycle;
        }
    }
}
