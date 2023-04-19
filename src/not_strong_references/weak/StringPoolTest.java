package not_strong_references.weak;

/*
-XX:StringTableSize=N - since late versions of Java 6 string pool size became configurable, where N is a size of the hash map
-XX:+PrintStringTableStatistics - command line argument for monitoring purposes
 */
public class StringPoolTest {
    public static void main(String[] args) {
            String siteName1 = "explainjava.com";
            String siteName2 = "explainjava.com";
            String sitename3 = new String("explainjava.com");
            String sitename4 = new String("explainjava.com").intern();
            String myName = "Sergey Razuev";
            String horseName = "Evgeniy Kunin";


            System.out.println(siteName1 == siteName2); // true
            System.out.println(siteName1 == sitename3); // false
            System.out.println(siteName1 == sitename4); // true
    }
}
