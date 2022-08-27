package ReflectionTest;

public class ReflectionExample {
    public static void main(String[] args) {
        ReflectionCheck reflectionCheck = new ReflectionCheck();
        Rabbit rabbit = new Rabbit();

        reflectionCheck.showClassName(rabbit);
        reflectionCheck.showClassFields(rabbit);
        reflectionCheck.showClassMethods(rabbit);
        reflectionCheck.showFieldAnnotation(rabbit);
    }
}
