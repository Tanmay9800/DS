import java.rmi.Naming;

public class AddClient {
    public static void main(String args[]) {
        try {
            // Lookup the remote object from the RMI registry
            AddInterface ai = (AddInterface) Naming.lookup("//localhost/Add");

            // Call the remote method and print the result
            System.out.println("The sum of 2 numbers is: " + ai.sum(10, 2));
        } catch (Exception e) {
            System.out.println("Client Exception: " + e);
        }
    }
}
