package GoF_Pattrens.Creational.Singleton;

class Test {
    public static void main(String[] args) {
        SingletonL s1 = SingletonL.getSingleton();
        SingletonL s2 = SingletonL.getSingleton();

        System.out.println(s1 == s2);
    }
}
