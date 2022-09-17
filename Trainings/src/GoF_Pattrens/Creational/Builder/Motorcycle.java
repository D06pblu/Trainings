package GoF_Pattrens.Creational.Builder;

public class Motorcycle {
    private String model; //понаделаем полей
    private String type;
    private int year;

    private Motorcycle(){}; //закрываем конструктор, во избежание

    @Override
    public String toString() {
        return "Motorcycle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                '}';
    }

    static class MotorcycleBuilder{     //пилим nested static. Чтобы его можно было отдельно вызывать
        Motorcycle motorcycle = new Motorcycle();

        public MotorcycleBuilder setModel(String model){
            motorcycle.model=model;
            return this;
        } public MotorcycleBuilder setType(String type){
            motorcycle.type=type;
            return this;
        }
        public MotorcycleBuilder setYear(int year){
            motorcycle.year=year;
            return this;
        }
        public Motorcycle build(){
            return motorcycle;
        }
    }
}

class main{
    public static void main(String[] args) {
        Motorcycle r1200gs = new Motorcycle.MotorcycleBuilder().setModel("BMW R1200GS").setYear(2005).setType("ENDURO BLEAT!!!").build();
        System.out.println(r1200gs);

        Motorcycle f800r = new Motorcycle.MotorcycleBuilder().setYear(2016).setModel("BMW F800R").build();
    }
}