package inheritance;

class ChildClass extends ParentClass {

    public ChildClass(String helloNS, String byeNS) {
        super(helloNS, byeNS);
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Child hello", "Child bye");
        System.out.println(childClass);
    }
}
