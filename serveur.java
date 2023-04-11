package tp4;

import java.rmi.Naming;

public class serveur {
	

	public static void main(String argv[]) {
		
		try {
			serverImpl obj = new serverImpl();
			java.rmi.registry.LocateRegistry.createRegistry(2000);
			Naming.rebind("//:2000/obj", obj);
			System.out.println("server en attente");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
