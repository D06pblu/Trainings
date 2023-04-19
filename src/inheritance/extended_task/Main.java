package inheritance.extended_task;

import inheritance.extended_task.a.ClassA;
import inheritance.extended_task.b.ClassB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassA classB = new ClassB();

        List<Integer> list = List.of(32,55,12,90,33,22);

        list.stream().map(integer -> integer+3).forEach(System.out::println);
    }
}
