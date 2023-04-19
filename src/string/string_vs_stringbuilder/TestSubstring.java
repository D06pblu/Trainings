package string.string_vs_stringbuilder;

public class TestSubstring {
    public static void main(String[] args) {


        String s1 = "String through line";
        String s2 = new String("String through new");

        String s3 = s2.substring(0,6); //возвращает строку через new String
        String s4 = "String";
        System.out.println(s3==s4);

    }
}
