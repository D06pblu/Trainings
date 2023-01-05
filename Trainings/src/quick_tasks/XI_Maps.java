package quick_tasks;

import java.util.HashMap;
import java.util.Map;
/*
1. Мапы поменяются местами
2. В обеих будут значения из m1
3. В обеих будут значения из m2
4. Вывалит исключение
 */
public class XI_Maps {
    static Map<String, String> m1 = new HashMap<>();
    static Map<String, String> m2 = new HashMap<>();

    static {
        m1.put("a", "AAAA");
        m1.put("b", "BBBB");
        m1.put("c", "CCCC");

        m2.put("a", "1111");
        m2.put("b", "2222");
        m2.put("d", "3333");
    }

    public static void main(String[] args) {
        System.out.println("Было:");
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);

        m2.replaceAll((key, value) -> m1.put(key, value)); //m1::put); //Что тут происходит?

        System.out.println("\nСтало:");
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
    }
}
