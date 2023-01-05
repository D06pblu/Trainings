package nested_classes;

public class AssotiationCompositionAggregation {
    int aInt;
    String aString;

    private void fuckThemAll(){
        System.out.println("Что за фашизм вы тут устроили?!");
    }
}

class OtherClass{
    int bInt;
    String bString;
    AssotiationCompositionAggregation aCA = new AssotiationCompositionAggregation();

}

class AnotherClass{
    public void examplePr(OuterClass outerClass){
        System.out.println("Yep, that's" + toString(outerClass));
    }

    private String toString(OuterClass outerClass) {
        return String.valueOf(outerClass.getClass());
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        AnotherClass anotherClass = new AnotherClass();

    }
}
