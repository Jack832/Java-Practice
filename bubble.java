import java.util.*;

class bubble
{
public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you are goinig to enter?");
		int value =sc.nextInt();
		int arr[]= new int[value];
    	for(int k=0;k<value;k++)
		{
    		arr[k]=sc.nextInt();
    	}
    	for(int i=0;i<value;i++)
    	{
    		 for(int o=0;o<value-1;o++)
    		 {
    		  if(arr[o]<arr[o+1])
       		  {
        		int temp= arr[o+1];
        		arr[o+1]=arr[o];
        		arr[o]=temp;
       			}
      		  }
     	}

    			for(int l=0;l<value;l++)
				{	
					System.out.println(" sort "+arr[l]+"\n");
				}
	}
}
	
