/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berkleyalgorithm;
import java.io.*;
import java.util.*;
/**
 *
 * @author GoStar
 */
public class BerkleyAlgorithm {
    

    static String toHourFormat(long seconds)
    {
            String s;
            
             long hours=seconds/3600;
           //  System.out.println("hours is "+hours+"seconds is "+seconds);
             long temphours=(seconds%3600);
             long minutes=temphours/60;
             long tempminutes=temphours%60;
             long second=tempminutes;
             
            s="hours: "+hours+"minutes :"+minutes+"Seconds :"+second;
        return s;
    }
    public static void main(String[] args)throws IOException {
        
        try
        {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //first time server tym set 
        Date d=new Date();
        int h=12;//d.getHours();
        int m=12;//d.getMinutes();
        int s=12;//d.getSeconds();
        System.out.println("time server time :"+ h +"hours "+ m +" minutes "+s+ "seconds");
        System.out.println("enter number of nodes ");
        int no=Integer.parseInt(br.readLine());
        int nodeh[]=new int[no];
        int nodem[]=new int[no];
        int nodes[]=new int[no];
        for(int i=0;i<no;i++)
        {
                System.out.println("for node "+ (i+1));
                System.out.println("enter hours");
                nodeh[i]=Integer.parseInt(br.readLine());
                System.out.println("enter minutes");
                nodem[i]=Integer.parseInt(br.readLine());
                System.out.println("enter seconds");
                nodes[i]=Integer.parseInt(br.readLine());
        }
        int diff[] = new int[no];
        int dh=0,dm=0,ds=0;
        for(int i=0;i<no;i++)
        {
            dh=h-nodeh[i];
             dm=m-nodem[i];
            ds=s-nodes[i];
            diff[i]=(dh*60*60)+(dm*60)+ds;
          
            
        }
        int sum=0;
        for(int i=0; i<no; i++)
        {
            sum+=diff[i];
        }
        float average = (float)sum/(no+1);
        System.out.println("The average of all time differences is "+average);
       for(int i=0; i<no; i++)
        {
            diff[i]+=average;
        }
        //now adding seconds to each nodes time
        for(int i=0;i<no;i++)
        {
            
            System.out.println(BerkleyAlgorithm.add(nodeh[i],nodem[i],nodes[i],diff[i]));
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }
    static String add(int h,int m,int s,int diff)
    {
        int seconds=0;
        
        
        seconds=(h*60*60)+(m*60)+s;
      
        seconds=diff+seconds;
        
       
      
        return toHourFormat(seconds);
    }
    
}
