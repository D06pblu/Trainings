package quick_tasks;

import java.util.Set;
import java.util.TreeSet;
/*
1. 1
2. 2
3. 3
4. ClassCastException
5. Compile Error
 */
public class X_TreeSet {
    public static void main(String[] args) {
        Set<Number> set = new TreeSet<>();
        set.add(1);
        set.add(1L);
        set.add(1.0);

        System.out.println(set.size());
    }
}
/*
Компилить разрешит, но на компайле будет ClassCastException.
Потому что в .add() вызывается compareTo(), а он не может сравнить разные классы
 */
