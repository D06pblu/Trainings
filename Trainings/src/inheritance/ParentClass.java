package inheritance;

import java.util.HashMap;
import java.util.Map;

public class ParentClass {
    static public String hello;
    static public final Number id = 0; //не задать сеттером
    static private String bye;
    static private final String subID = "Parent static subID"; //не задать сеттером
    static final Map<String, String> map = new HashMap<>();

    public String helloNS;
    public final Number idNS = 123;
    private String byeNS;
    private final String subIDNS = "Parent non static subID";

    static {
        hello = "Hello!";
        bye = "Bye!";
    }

    {
        map.put("Non-static", "Block");
        map.put(hello, bye);
    }

    public ParentClass(String helloNS, String byeNS) { //final и static не доступны в конструкторе
        this.helloNS = helloNS;
        this.byeNS = byeNS;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "helloNS='" + helloNS + '\'' +
                ", idNS=" + idNS +
                ", byeNS='" + byeNS + '\'' +
                ", subIDNS='" + subIDNS + '\'' +
                '}';
    }

    final void WTF(final String s, final int i){
        final int j=0;

    }
}

