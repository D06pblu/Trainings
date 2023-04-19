package generics;

import java.util.List;


public class VarargsTest {
    @SafeVarargs
    public static <E> void addAll(List<E> list, E... array) {

        for (E element : array) {
            list.add(element);
        }
    }
}
