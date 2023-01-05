package constructors;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Test kleineTest = null;
//        TestSubstring zweiKleineTest = null;
        try {
//            zweiKleineTest = new TestSubstring(12, "Twelve", LocalDateTime.now());
            kleineTest = new Test(5, "Five", LocalDateTime.now());
        } catch (Exception e) {
            System.err.println(e);;
        }

        System.out.println(kleineTest);

//        System.out.println(zweiKleineTest);

        System.out.println(Test.staticTest);
    }
}
