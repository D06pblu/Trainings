package quick_tasks.static_blocks_and_exceptions;

public class B  extends A{
    public static final String b = "class interfaces.B";
    public static  int i = 20;

    static{
        System.out.println("Static interfaces.B");
        i = Integer.parseInt("23");
    }
    public B() {
        System.out.println("constr interfaces.B");
        System.out.println(i);
    }
}
