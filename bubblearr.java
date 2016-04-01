import java.util.*;
class bubblearr
{
	//part1: input from user strings

    public static void main(String arg[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many no you are goinig to enter?");
	int value =sc.nextInt();
	String arr[]= new String[value];
        for(int k=0;k<value;k++)
	{
    	arr[k]=sc.next();
        }
        int len=arr.length;

        //par2:sort   compare
    	for(int i=0; i<len;i++)
	{
    	for(int k=0;k<len-1;k++)
	 {	 
	  if(arr[k].compareTo(arr[k+1]) > 0)
	   {

    		String temp=arr[k];
     		arr[k]=arr[k+1];
     		arr[k+1]=temp;
            }
	 }
       }

//print
	  for(int l=0;l<len;l++)
	   {
	     System.out.println(" after sort "+arr[l]+"\n");
	    }
	}
} 


