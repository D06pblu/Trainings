package collections.iterator_vs_iterable;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = new Integer[100];
        for (int i = 0; i < 20; i++) {
            integers[i]=(i+i*13+i*3+i*10);
        }

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Collections.addAll(arrayList, integers);
        Collections.addAll(linkedList, integers);

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(linkedList.get(i));
        }
        long t2 = System.currentTimeMillis();
        long deltaT = t2-t1;
        System.out.println("Время выполнения for для линкед листа = " + deltaT);

        Iterator<Integer> integerIterator = arrayList.iterator();
        Iterator<Integer> integerIterator1 = linkedList.iterator();

    }
}
