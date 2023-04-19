package quick_tasks;
/*
какой будет вывод?
 */
public class I_Strings_vs_StringBuilder {
    public static void main(String[] args) {

    String string = "hello";
    StringBuilder stringBuilder = new StringBuilder("hello");
    StringBuilder stringBuilder2 = new StringBuilder("hello");

    //System.out.println(string == stringBuilder);
    System.out.println(stringBuilder.equals(stringBuilder2));
    System.out.println(string.equals(stringBuilder));
    System.out.println(stringBuilder==stringBuilder2);
    }
}
