import java.rmi.Naming;
public class StartFileServer 
{
	public static void main(String[] args) 
        {
		try
                {
			java.rmi.registry.LocateRegistry.createRegistry(1004);
			FileServer fs=new FileServer();
			fs.setFile("hanane.jpg");			
			Naming.rebind("rmi://10.194.119.29/abc", fs);
			System.out.println("File Server is Ready");
		}
                catch(Exception e)
                {
			e.printStackTrace();
		}
	}	
}