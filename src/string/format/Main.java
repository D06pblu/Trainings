package string.format;

public class Main {
    public static void main(String[] args) {

        String name = "Sergey";

        String message = "Hi, %s".formatted(name);

        System.out.println(message);
    }
}
