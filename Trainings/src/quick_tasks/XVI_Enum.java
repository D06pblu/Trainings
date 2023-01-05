package quick_tasks;
/*
какой вывод в консоль?
 */
public class XVI_Enum {
    public static void main(String[] args) {
        System.out.println(Values.A);
    }
}

enum Values{
    A(1), B(2), C(3);

    Values (int i){
        System.out.println("constructor " + i);
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("non static block");
    }
}
/*
порядок инициализации Enum?
значения enum это static final поля
 */