import java.util.Arrays;

public class SimpleDimple {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
       int i=0;
       String s = "Hello";
       s=s+"Hi";
       System.out.println(s);

        sb.append(new Integer(2))
                .append("; ")
                .append(false)
        .append("; ");
        sb.append(Arrays.asList(1,2,3));
        sb.append("; ");

        System.out.println(sb); // 2; false; [1, 2, 3];
    }

}
 class Test{

 }