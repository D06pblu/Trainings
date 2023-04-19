package gof_pattrens.creational.factory_method;

interface Rider {
    void ride();
}

interface RiderFactory{
    Rider createRider();
}
