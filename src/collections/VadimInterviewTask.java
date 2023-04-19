package collections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class VadimInterviewTask {
    public static Collection<Integer> newCollection(Collection<Integer> collection) {

        /////////// решение через итератор /////////////
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%2 != 0){
                iterator.remove();
            }
        }
        Collection newCollection = collection;
        return newCollection;

//////// решение на рефлексии ///////
//        try {
//            final Class<? extends Collection> collectionClass = collection.getClass();
//            final Constructor collectionConstructor = collectionClass.getDeclaredConstructor();
//            final Collection newCollection = (Collection) collectionConstructor.newInstance();
//            for (Integer integer : collection) {
//                if (integer % 2 == 0) {
//                    newCollection.add(integer);
//                }
//            }
//
//            return newCollection;
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }

        //////// решение через удаление из существующей, но не пройдет тест на новизну коллекции ///////////
//        collection.removeIf(v->v%2!=0);
//        return collection;
    }

    public static class Main {
        public static void main(String[] args) {
            class MyCustomArrayList<T> extends ArrayList<T> {
                public void hello() {
                    System.out.println("hello");
                }
            }
            MyCustomArrayList<Integer> parameter = new MyCustomArrayList<>();
            Collection<Integer> actual = VadimInterviewTask.newCollection(parameter);
        }
    }
}
