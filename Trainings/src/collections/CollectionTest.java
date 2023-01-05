package collections;

import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {


    ArrayList<Integer> arrayList = new ArrayList<>();

        long t1 = System.currentTimeMillis();
    for (int i = 0; i < Integer.MAX_VALUE; i++){
        arrayList.add(i);
        System.out.println("ПРивет уже блэт");
    }
}
}

