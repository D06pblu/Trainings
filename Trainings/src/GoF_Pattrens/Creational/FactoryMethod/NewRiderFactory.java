package GoF_Pattrens.Creational.FactoryMethod;

class HorsemanFactory implements RiderFactory{
    @Override
    public Rider createRider() {
        return new Horseman();
    }
}

class TruckDriverFactoy implements RiderFactory{
    @Override
    public Rider createRider() {
        return new TruckDriver();
    }
}