package alfa4i;

import java.util.ArrayList;
import java.util.List;

public class CompWithAlfa {
    public static void main(String[] args) {

        String[] array1 = {"мама", "мыла", "раму", "но", "зачем", "?"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort(((o1, o2) -> o2.length-o1.length));

        for(String[] array : arrays){
            System.out.println(" ");
            for(String string : array){
                System.out.print(string + " ");
            }
        }
    }
}
