import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
class HelloImpl extends HelloPOA 
{
	private ORB orb;
	static String aname[]=new String[10];
	static int i=aname.length-1;
	
	static int aage[]=new int[10];
	static int awt[]=new int[10];
	static float mem[]=new float[10];
	
	public void setORB(ORB orb_val) 
	{
		orb = orb_val; 
	}
	public int search(String name)
	{
		for(int j=0;j<aname.length;j++)
		{
			if(aname[i]==name)
			return j;
		}
		return 0;	
	}
	public void register(String name,int age,int wt)
	{	
		
		aname[i]=name;
		
		
		
		aage[i]=age;
		
		awt[i]=wt;
		mem[i]=1;
	}
	public float renew(float c,int i)
	{
		mem[i]=c;
		return c;		


	}
	public float bmi(int wt,float h)
	{
		float bmi=(wt/(h*h));
		return bmi;
	}

	public float upgrade(float c,int i)
	{
		mem[i]+=c;
		return mem[i];

	}


	

	public String sayHello() 
	{
		return "\nHello world !!\n";
	}

	public void shutdown() 
	{
		orb.shutdown(true);
	}
}
public class HelloServer1
{
	public static void main(String args[]) 
	{
		try
		{
			ORB orb = ORB.init(args, null);
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
			HelloImpl helloImpl = new HelloImpl();
			helloImpl.setORB(orb); 
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
			Hello href = HelloHelper.narrow(ref);
			org.omg.CORBA.Object objRef =orb.resolve_initial_references("NameService");
	      // Use NamingContextExt which is part of the Interoperable
	      // Naming Service (INS) specification.
	      NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
	
	      // bind the Object Reference in Naming
	      String name = "Hello";
	      NameComponent path[] = ncRef.to_name( name );
	      ncRef.rebind(path, href);

	      System.out.println("HelloServer ready and waiting ...");

	      // wait for invocations from clients
	      orb.run();
	    } 
		
	      catch (Exception e) {
	        System.err.println("ERROR: " + e);
	        e.printStackTrace(System.out);
	      }
		  
     System.out.println("HelloServer Exiting ...");
	  }
	}
