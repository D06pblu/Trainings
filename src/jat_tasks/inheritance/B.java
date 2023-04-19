package jat_tasks.inheritance;

public class B extends A {
    public static final String b = "class B";
    public static int i = 0;

    static {
        i = Integer.parseInt("23");
    }
}
