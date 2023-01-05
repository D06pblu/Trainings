package serialization.test_for_switch;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObj {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("personTest.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();

            ois.close();

            System.out.println(person1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
