import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AddServer {
    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(1099); // Create RMI registry on port 1099
            Add obj = new Add();
            Naming.rebind("Add", obj);
            System.out.println("Server is connected and waiting for the client");
        } catch (Exception e) {
            System.out.println("Server could not connect: " + e);
        }
    }
}
