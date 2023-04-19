package generics;

import java.util.ArrayList;
import java.util.List;

public class PECSTest02 {
    public static void copy (List<? extends Number> source, List<? super Number> dest) {
        for (Number number : source){
            dest.add(number);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = (ArrayList<Integer>) List.of(11,22,33,44);
        List<? super Number> longs = new ArrayList<>();

        PECSTest02.copy(integers, longs);
        System.out.println(longs);
    }
}
