import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            try {
                LocateRegistry.createRegistry(1099);
            } catch (Exception e) {
                // Registry may already be running on port 1099
            }
            Calc_Implementation obj = new Calc_Implementation();
            Naming.rebind("rmi://localhost:1099/Calculator", obj);
            System.out.println("RMI Server Started....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
