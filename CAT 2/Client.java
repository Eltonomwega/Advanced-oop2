import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
  private Client() {}

  public static void main(String[] args){
    try{
      //Gettint the registry
      Registry registry = LocateRegistry.getRegistry(null);

      // Looking up the regitry for the remote object
      Hello stub = (Hello) registry.lookup("Hello");

      // Calling the remote method using the obtained object
      stub.animation();

    }catch(Exception e){
        System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace();
    }
  }
}
