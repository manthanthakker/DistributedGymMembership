import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.util.*;
public class HelloClient1
{
  static Hello helloImpl;

  public static void main(String args[])
    {
      float rem=0;
    Scanner sc=new Scanner(System.in);
    
      try{
        // create and initialize the ORB
	ORB orb = ORB.init(args, null);

        // get the root naming context
        org.omg.CORBA.Object objRef = 
	    orb.resolve_initial_references("NameService");
        // Use NamingContextExt instead of NamingContext. This is 
        // part of the Interoperable naming Service.  
        NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
 
        // resolve the Object Reference in Naming
        String name = "Hello";
        helloImpl = HelloHelper.narrow(ncRef.resolve_str(name));

        //System.out.println("Obtained a handle on server object: " + helloImpl);
        //System.out.println(helloImpl.sayHello());
       
        out:
        while(true)
    {
      System.out.println("enter your option\n");
      System.out.println("1.Register\n2.renew\n3.upgrade membership\n4.bmi\n5.exit");
      int choice=sc.nextInt();
      String name1="hi";
      switch(choice)
      {
      case 1:
      System.out.println("------Registeration from-------");
      System.out.println("enter name ");
       name=sc.nextLine();
       name=sc.nextLine();
      System.out.println("enter age ");
      int age=sc.nextInt();
      System.out.println("enter weight ");
      int wt=sc.nextInt();
      
      helloImpl.register(name,age,wt);
      System.out.println("succesfully registered with following info");
      System.out.println("name----->age----->wt");
      System.out.println(name+"----->"+age+"----->"+wt);
      break;
      case 2:
        System.out.println("-----renew membership-----\n");
        System.out.print("enter your name\n");
         name=sc.next();
        int index=helloImpl.search(name);

        System.out.println("enter renewal plan\n");
        System.out.println("1.\t1year->rs6000\n2.6months->rs4000\n");
        int c=sc.nextInt();
        switch(c)
        {
          case 1:
          rem=helloImpl.renew(1f,index);
          break;
          case 2:
          rem=helloImpl.renew(0.5f,index);
        break;
        }
        System.out.println("congrats "+name+" membership has been renewed\n with membership time="+rem);
        break;
        case 3:
        System.out.println("-----renew membership-----\n");
        
        System.out.print("enter your name");
        name1=sc.nextLine();
         name1=sc.nextLine();
         name1=sc.nextLine();
        int index1=helloImpl.search(name1);
            
        System.out.println("enter renewal plan\n");
        System.out.println("1.\t1year->rs6000\n2.6months->rs4000\n");
        c=sc.nextInt();
        switch(c)
        {
          case 1:
          rem=helloImpl.upgrade(1f,index1);
          System.out.println("congrats "+name+"plan renewed for a year\n with membership time="+rem);
          break;
          case 2:
          rem=helloImpl.upgrade(0.5f,index1);
          System.out.println("congrats "+name+"plan renewed for 6months\n with membership time="+rem);
          break;
        }
        break;
        case 4:
        System.out.println("-----calculate bmi-----");
        System.out.println("enter weight\n");
         wt=sc.nextInt();
        System.out.println("enter height in metres");
        float h=sc.nextFloat();                                                
 
        float bmiresult=helloImpl.bmi(wt,h);
        if(bmiresult<19)
        {
          System.out.println("underweight");
          continue;
        }
        if(bmiresult<24)
        {
          System.out.println("normal weight");
          continue;
        }
        if(bmiresult<30)
        {
          System.out.println("overweight");
          continue;
        }
        else
        {
          System.out.println("obese");
          
        }
        break;
        case 5:
        break out;

      } 
      
    }
  
        helloImpl.shutdown();

	} catch (Exception e) {
          System.out.println("ERROR : " + e) ;
	  e.printStackTrace(System.out);
	  }
    }

}
