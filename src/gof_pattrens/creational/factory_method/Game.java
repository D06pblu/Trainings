package gof_pattrens.creational.factory_method;

public class Game {
    public static void main(String[] args) {
        RiderFactory riderFactory = createRiderByRideObject("motorcycle"); //чтобы создать другого райдера надо поменять только тут
        Rider rider = riderFactory.createRider();

        rider.ride();
    }

    static RiderFactory createRiderByRideObject (String rideOdject){ //метод для определения какого райдера создать
        if (rideOdject.equalsIgnoreCase("horse")){
            return new HorsemanFactory();
        }else if (rideOdject.equalsIgnoreCase("truck")) {
            return new TruckDriverFactoy();
        }else {
            throw new RuntimeException(rideOdject + " - is unknown object to ride.");
        }
    }
}
