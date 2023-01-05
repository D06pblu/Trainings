package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VadimInterviewTaskTest {

    @Test
    void newCollection_ShouldWorkProperlyWithList() {
        List<Integer> parameter = new ArrayList<>();
        Collection<Integer> actual = VadimInterviewTask.newCollection(parameter);
        assertInstanceOf(parameter.getClass(), actual);
    }

    static class MyCustomArrayList<T> extends ArrayList<T>{
        public MyCustomArrayList(){
            super();
        }
        public void hello(){
            System.out.println("hello");
        }
    }

    @Test
    void newCollection_ShouldWorkProperlyWithCustomCollection() { //если кастомную коллекцию пихнуть в метод, то работать не будет
        MyCustomArrayList<Integer> parameter = new MyCustomArrayList<>();
        Collection<Integer> actual = VadimInterviewTask.newCollection(parameter);
        assertInstanceOf(parameter.getClass(), actual);
    }

    @Test
    void newCollection_ShouldReturnNewCollection() {
        List<Integer> parameter = new ArrayList<>();
        Collection<Integer> actual = VadimInterviewTask.newCollection(parameter);
        assertTrue(parameter != actual);
    }

//    @Test
//    void newCollection_ShouldWorkProperlyWithAnonymousCollection() {
//        MyCustomArrayList<Integer> parameter = new MyCustomArrayList<>();
//        Collection<Integer> actual = VadimInterviewTask.newCollection(parameter);
//        assertInstanceOf(parameter.getClass(), actual);
//    }
}