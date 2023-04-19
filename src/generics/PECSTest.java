package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PECSTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("это", "лист", "стрингов");
        List<Integer> integers = Arrays.asList(11, 22, 33);


        List<? extends Number> integers1 = new ArrayList<>();
        integers1.add(null);
        List<Integer> integers2 = Arrays.asList(null,1,2,3,4);
        integers1 = integers2;
        System.out.println(integers1);
        integers2.set(0, 99);
        integers2.add(6, 106);
//        integers1.set(1, 109);
        System.out.println(integers1);
    }

    public static <T> List<T> remove(List<T> list, int index){
        return null;
    }
}

