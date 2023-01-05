package serialization.simple.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Петя", 8);
        ChildClass childClass1 = new ChildClass("Космос", 3);

        try {
            FileOutputStream fos = new FileOutputStream("serialWOparentDefaultConstr.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(childClass);
            oos.writeObject(childClass1);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
