package nested_classes;

public class OuterClass {
    int outerNumber = 9;
    public void heyFromOuter(){
        System.out.println("Hello from outer class");
    }
    public class InnerClass{
        int innerNumber = 11;
        public void heyFromInner(){
            System.out.println("Hello from inner class!");
        }
    }
    private class PrivInnerClass{
        String prInStrng;

    }
    private static class PrivStatInnerClass{
        static String prStatInString;

        public void heyFromPrivStatInner(){
            System.out.println("Hello from Private Static Inner Class! " + prStatInString);
        }
    }
}
