package quick_tasks;

public class V_Pools {
    public static void main(String[] args) {
        Long a = 111L;
        Long b = 111L;
        Long c = 222L;
        Long e = 222L;

        Byte y = 100;
        Byte z = 100;

        Short p = 129;
        Short s = 129;
        Short f = 126;
        Short d = 126;

        System.out.println(a == b); //размер лонг пула тоже от -128 до 127, но его нельзя поменять в отличии от int
        System.out.println(c == e);
        System.out.println(y==z);
        System.out.println(p==s);
        System.out.println(f==d);
    }
}
