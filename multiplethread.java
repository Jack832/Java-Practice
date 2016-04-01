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
    


//bubble for Array
  
class bubble implements Runnable
 {
    
   int arr1[];
   public  bubble(int arr1[])
   {
    this.arr1=arr1;
    }
 
  	public void run()
	{
    double start1=System.currentTimeMillis();
	  for(int i=0;i<arr1.length;i++)
      {
       for(int o=0;o<arr1.length-1;o++)
       {
    	if(arr1[o]<arr1[o+1])
       	{
        int temp= arr1[o+1];
        arr1[o+1]=arr1[o];
        arr1[o]=temp;
       	}
       }
      }
      for(int l=0;l<arr1.length;l++)
	  {	
		System.out.println(" bubble "+arr1[l]);
	  }
     double stop1=System.currentTimeMillis();
        double total1=(stop1-start1)/1000;
        System.out.println(" time for bubble"+total1);
    }
}
class multiplethread
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
		Thread p2= new Thread(new bubble(op));
        Thread p1= new Thread(new insertioninteger(op));
       	p1.run();
       	p2.run();
	}
}
	    

