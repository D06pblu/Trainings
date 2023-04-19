package nested_classes;

public class MainClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.heyFromOuter();

        //OuterClass.InnerClass iner = new InnerClass();                  //так не сработает
        //OuterClass.InnerClass iner = new OuterClass.InnerClass();       //так не сработает
        OuterClass.InnerClass inner = outer.new InnerClass();           //а вот так сработает
        inner.heyFromInner();
    }
}
