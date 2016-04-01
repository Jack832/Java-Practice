import java.util.*;
import java.io.*;
import java.util.Arrays;
class insertioninteger implements Runnable
{      
        int arr[];
		public insertioninteger(int arr[])
    	{
     	this.arr=arr;
     	}

		public void run()
		{
        double starts=System.currentTimeMillis();
        for(int i=1; i<arr.length;i++)
	  	 {
	 	 	for(int k=i;k>0;k--)
	   	  	{	 
				if(arr[k]<(arr[k-1]))
				{
  				int temp=arr[k];
   				arr[k]=arr[k-1];
   				arr[k-1]=temp;
         		}
	   	  	}
	 	 }
        
        for(int l=0;l<arr.length;l++)
		{	
			System.out.println(" insertion "+arr[l]);
            
		}
        double stops=System.currentTimeMillis();
        double total=(stops-starts)/1000;
        System.out.println(" time for insertion "+total);
 	  	}
}
public class multip
{
    
	public static void main(String args[])
	{
			
        int op[]= new int[50];
	 	
       for(int j=0;j<op.length;j++)
       {
      	op[j]=(int)(Math.random()*200+1);
        }
        //bubble b1=new bubble(op);
        //insertioninteger i1= new insertioninteger(op);
		
        Thread p1= new Thread(new insertioninteger(op));
       	p1.start();
       
	}
}
	    
