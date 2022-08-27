package GoF_Pattrens.Creational.FactoryMethod;

class Horseman implements Rider{
    @Override
    public void ride() {
        System.out.println("Horesman ride a horse.");
    }
}

class TruckDriver implements Rider{

    @Override
    public void ride() {
        System.out.println("Truck Driver drive a truck.");
    }
}