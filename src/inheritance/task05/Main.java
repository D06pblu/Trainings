package inheritance.task05;

public class Main {
    public static void main(String[] args) {

        String str = "";
        Object obj = str;

        Parent parent = new Child();
        parent.print(str);
        parent.print(obj);

        System.out.println("*********");

        Child child = new Child();
        child.print(str);
        child.print(obj);

    }
}
