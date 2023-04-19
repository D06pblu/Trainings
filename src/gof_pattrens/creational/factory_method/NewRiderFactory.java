package gof_pattrens.creational.factory_method;

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