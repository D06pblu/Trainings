package comparator_vs_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MotorcycleSorter {
    public static void main(String[] args) {
        List<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles.add(new Motorcycle("BMW", "R1200GS", 2004, 224));
        motorcycles.add(new Motorcycle("Yamaha", "Tenere 700", 2019, 204));
        motorcycles.add(new Motorcycle("KTM", "690 Enduro", 2019, 160));

        motorcycles.stream().forEach(System.out::println);

        motorcycles.get(0).setModelProductionStart(2004);

        System.out.println("************");
        motorcycles.stream().forEach(System.out::println);


        System.out.println("Before Sorting : " + motorcycles);
        Collections.sort(motorcycles);
        System.out.println("After Sorting : " + motorcycles);
    }
}
