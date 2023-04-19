package generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendsVsSuper {
    public void Method() {

        List<? extends Number> nums1 = new ArrayList<>(); //почему тут нельзя, а в nums2 можно?
        nums1.add(null);

        List<? super Number> nums2 = new ArrayList<>();
        nums2.add(Double.valueOf(3.14));

        List<?> nums = new ArrayList<>(); // просто <?> равнозначен <? extends Object>, так что PECS действует
//         nums.add(3.14);

    }
}