package gof_pattrens.creational.singleton;

class Test {
    public static void main(String[] args) {
        SingletonL s1 = SingletonL.getSingleton();
        SingletonL s2 = SingletonL.getSingleton();

        SingletonF sf1 = SingletonF.getSingletonF();
        SingletonF sf2 = SingletonF.getSingletonF();

        System.out.println(s1 == s2);
        System.out.println(sf1==sf2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sf1);
        System.out.println(sf2);
    }
}
