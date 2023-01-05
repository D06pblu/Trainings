package serialization.simple.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObj {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("serialWOparentDefaultConstr.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ChildClass cc = (ChildClass) ois.readObject();
            ChildClass cc1 = (ChildClass) ois.readObject();

            ois.close();

            System.out.println(cc);
            System.out.println(cc1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
