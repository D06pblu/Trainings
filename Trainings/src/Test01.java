import exceptions.HelloException;

import java.util.List;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        String one="123";
        String two=new Integer(123).toString().intern();
        System.out.println(one == two);


        String sql =
                //language=SQL
                "SELECT * FROM home WHERE home.user = 'Katya'";

    }
}



