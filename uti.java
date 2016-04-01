import java.io.*;
import java.util.*;
public class utia
{
    public static void main(String arg[])
	{
    	Scanner sc =new Scanner (System.in);
    	System.out.println("enter the values for bubblesort");
    	int number =sc.nextInt();
        int b[]= new int[number];
        for(int n=0;n<number;n++)
        {
    		b[n]=sc.nextInt();
        }
       uti.bubblearr(number,b);
    }
}

