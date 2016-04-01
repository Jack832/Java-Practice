import java.util.*;
class insertion
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
    	for(int i=1; i<len;i++)
		{
    		for(int k=i;k>0;k--)
			{	 
				if(arr[k].compareTo(arr[k-1]) < 0)
				{

    			String temp=arr[k];
     			arr[k]=arr[k-1];
     			arr[k-1]=temp;
                 for(int l=0;l<len;l++)
				{	
					System.out.println(" "+l+"Lap");
		    		 System.out.println(" sort "+arr[l]+"\n");
				}
										
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


