import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Krithik", "3624005412", "36-24 st.");

        try {
            FileOutputStream fos = new FileOutputStream("JavaObject.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customer);
            oos.close();
            System.out.println("Serialization completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    // getters and setters here
}