package GoF_Pattrens.Creational.FactoryMethod;

interface Rider {
    void ride();
}

interface RiderFactory{
    Rider createRider();
}
