package quick_tasks.static_blocks_and_exceptions;
/*
значение файнал стрингов напрямую подставляется в тех местех где мы их вызываем.
Т.е. в саму переменную он не смотрит, мы это проверили в байт кодеx
а вот с Integer пулом так не происходит, все равно обращается к переменной
 */
public class A {

    public static final String a = "class A";
    public static  int i = 10;

//    static{
//        System.out.println("Static A");
//        i = Integer.parseInt(a); //тут будет какая-то ошибка
//    }

    public A() {
        System.out.println("constr A");
        System.out.println(i);
    }
}
