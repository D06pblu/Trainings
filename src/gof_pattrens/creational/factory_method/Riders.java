package gof_pattrens.creational.factory_method;

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