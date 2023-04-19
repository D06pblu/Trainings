package quick_tasks;

import java.util.ArrayList;
import java.util.List;
/*
3
4
Class Cast Exception
Runtime Exception
 */
public class XII_Longs {
    public static void main(String[] args) {
        List longs = new ArrayList<Long>();
        longs.add(1L);
        longs.add(1.0);
        longs.add(new Object());
        longs.add("New Long");
        longs.add(new StringBuilder("new StringBuilder же ну"));
        longs.add(new FizzBuzz());

        System.out.println(longs.size());
        for (Object o : longs) {
            System.out.println(o);
        }
    }
}
/*
стирание информации о дженериках. дженерики существуют только на уровне компиляции, в рантайме инфа затирается
т.к. лист не типизирован, то запихать можно что угодно
 */
