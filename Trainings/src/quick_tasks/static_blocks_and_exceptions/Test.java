package quick_tasks.static_blocks_and_exceptions;

public class Test {
    private static String string = "test main class";

    public static void main(String[] args) {
        try {
            B b = new B();

        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println(string);
//        System.out.println(interfaces.B.i);
//        System.out.println(A.i);
        System.out.println(A.a);
        System.out.println(B.b);


//        A b = new interfaces.B();
    }
}
/*
1. Прикол с файнал стрингами
2. Прикол с тем как мы нашли прикол с файнал стрингами - как смотреть байт код
3. Прикол с тем как билдится байт код - инкрементно
4. Прикол с LLI (loading, linking, initialization) - LL делается для обоих, иначе бы В вообще не загрузился,
а I уже выполняется по нашему стандартному плану загрузки и дальше загрузки статики у А не идет
5. Прикол с хайдингом переменной i, на которую мы сначала грешили - не сработал
 */
