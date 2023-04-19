package serialization.test_for_switch;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            FileOutputStream fos = new FileOutputStream("personTest.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
