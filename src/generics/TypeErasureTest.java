package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeErasureTest {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("это", "лист", "стрингов");
        List<Integer> integers = Arrays.asList(11, 22, 33);

        List<Number> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(3.14);
        numbers.add(123123L);

        List<String> strings1 = List.of("this","list","created","by","List.of");

        System.out.println(strings.getClass().getName());
        System.out.println(integers.getClass().getName());
        System.out.println(numbers.getClass().getName());
        System.out.println(strings1.getClass().getName());

        System.out.println(strings.getClass() == integers.getClass());
        System.out.println(strings.getClass() == strings1.getClass());
    }
}

