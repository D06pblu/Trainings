package quick_tasks;
/*
что выведет?
 */
public class IV_Strings {
    public static void main(String[] args) {
        String s1 = "hello";
        final String s2 = "hel";
        String s3 = "lo";
        String s4 = "hello";

        System.out.println(s1 == s4);
        System.out.println(s1 == s2 + s3); //то s2+s3 сделается в рантайме и не попадет в стринг пул
        System.out.println(s1 == s2 + "lo"); //Т.к. s2 final, то слепливание произойдет на этапе компиляции и результат попадет в стринг пул


//        String c1 = new String("ABC");
//        String c2 = "ABC";
//        System.out.println(c1 == c2);
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.intern() == c2);
//        System.out.println(c1 == c2);
//
//        String c3 = new String ("   ABC   ");
//        c3.trim();
//        System.out.println(c1.equals(c3));
    }
}
