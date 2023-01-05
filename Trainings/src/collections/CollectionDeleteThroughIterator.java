package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDeleteThroughIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<50; i=i+4){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            if(itr.next()%3==0)
                itr.remove();
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
