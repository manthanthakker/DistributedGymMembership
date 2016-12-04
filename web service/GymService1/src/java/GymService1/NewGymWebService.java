/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymService1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author GoStar
 */
@WebService(serviceName = "NewGymWebService")
public class NewGymWebService {
    static String aname[]=new String[10];
	static int i;
	
	static int aage[]=new int[10];
	static int awt[]=new int[10];
	static float mem[]=new float[10];
	
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "register")
    public String register(@WebParam(name = "name") String name, @WebParam(name = "age") int age, @WebParam(name = "weight") int weight) {
        //TODO write your implementation code here:
         aname[i]=name;
		
		
		
		aage[i]=age;
		
		awt[i]=weight;
		mem[i]=0;
                i++;

        return "done";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "renew")
    public float renew(@WebParam(name = "name") String name, @WebParam(name = "membership") float membership) {
        //TODO write your implementation code here:
        int i1=search(name);
         mem[i1]=membership;
		return membership;
       
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "upgrade")
    public String upgrade(@WebParam(name = "name") String name, @WebParam(name = "membership") float membership) {
        //TODO write your implementation code here:
        int i1=search(name);
        
        mem[i1]+=membership;
		return mem[i1]+" ";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bmi")
    public String bmi(@WebParam(name = "height") float height, @WebParam(name = "weight") float weight) {
        //TODO write your implementation code here:
        float bmi=(weight/(height*height));
		return bmi+" ";
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public Integer search(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
         for(int j=0;j<i;j++)
		{
			if(name.equals(aname[j]))
			return j;
		}
		return -1;	
        
    }
}
