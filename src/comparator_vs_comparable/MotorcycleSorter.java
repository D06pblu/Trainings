package comparator_vs_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MotorcycleSorter {
    public static void main(String[] args) {
        List<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles.add(new Motorcycle("BMW", "R1200GS", 2007, 224));
        motorcycles.add(new Motorcycle("BMW", "F800GS", 2007, 214));
        motorcycles.add(new Motorcycle("Yamaha", "Tenere 700", 2018, 204));
        motorcycles.add(new Motorcycle("KTM", "690 Enduro", 2019, 160));
        motorcycles.add(new Motorcycle("KTM", "790 Enduro", 2019, 204));

        motorcycles.stream().forEach(System.out::println);

//        motorcycles.get(0).setModelProductionStart(2004);

//        System.out.println("************");
//        motorcycles.stream().forEach(System.out::println);
//
//
//        System.out.println("Before Sorting : " + motorcycles);
//        Collections.sort(motorcycles);
//        System.out.println("After Sorting : " + motorcycles);

        Comparator<Motorcycle> byWeight = (m1, m2) -> Integer.compare(m1.getWetWeight(), m2.getWetWeight());
        Collections.sort(motorcycles, byWeight);
        motorcycles.stream().forEach(System.out::println);
    }
}
