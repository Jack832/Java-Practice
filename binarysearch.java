import java.util.Arrays;
import java.util.*;

class binarysearch
{
 public static int binarySearch(int min, int max, String word , String[] words)
	{
    if(max<min)
	{
    	return -1;
		}
		int mid=(min+max)/2;
		if(words[mid].equals(word))
		{
		return mid;
		}
		else if(words[mid].compareTo(word) > 0)
		{
			return binarySearch(min ,mid-1,word,words);
		}
		else
		{
			return binarySearch(mid+1 ,max,word,words);
		}
	}

	public static void main(String arg[])
	{
	
    
    	//part1 insert names
    	binarysearch ba= new binarysearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many names you are goinig to enter?");
		int value =sc.nextInt();
		String arr[]= new String[value];
    	for(int k=0;k<value;k++)
		{
     		arr[k]=sc.next();
    	}
		//part2 user input
		System.out.println("enter name for search");
		String namesearch=sc.next();
	
		//part3 part2 binary search method          prin
    	Arrays.sort(arr);
   	    int len=arr.length;
   		try
		{
	    	int gotit=ba.binarySearch(0,len,namesearch,arr);
	    	 if(gotit == -1)
			{
				System.out.println("not in the list");
			}	
   		 	else
    		{
				System.out.println("got the name");
			}
		}
    	catch(ArrayIndexOutOfBoundsException ce )
		{
     		System.out.println(ce);
		}
	}
}

