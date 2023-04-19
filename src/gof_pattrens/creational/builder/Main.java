package gof_pattrens.creational.builder;

public class Main{
    public static void main(String[] args) {
        Motorcycle r1200gs = new Motorcycle.MotorcycleBuilder().setModel("BMW R1200GS").setYear(2005).setType("ENDURO BLEAT!!!").build();
        System.out.println(r1200gs);

        Motorcycle f800r = new Motorcycle.MotorcycleBuilder().setYear(2016).setModel("BMW F800R").build();
        System.out.println(f800r);
    }
}
